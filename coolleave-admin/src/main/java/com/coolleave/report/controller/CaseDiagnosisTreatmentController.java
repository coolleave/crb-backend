package com.coolleave.report.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.coolleave.common.annotation.Log;
import com.coolleave.common.core.controller.BaseController;
import com.coolleave.common.core.domain.AjaxResult;
import com.coolleave.common.enums.BusinessType;
import com.coolleave.report.domain.CaseDiagnosisTreatment;
import com.coolleave.report.service.ICaseDiagnosisTreatmentService;
import com.coolleave.common.utils.poi.ExcelUtil;
import com.coolleave.common.core.page.TableDataInfo;

/**
 * 病例诊治处理Controller
 * 
 * @author coolleave
 * @date 2026-01-01
 */
@RestController
@RequestMapping("/report/treatment")
public class CaseDiagnosisTreatmentController extends BaseController
{
    @Autowired
    private ICaseDiagnosisTreatmentService caseDiagnosisTreatmentService;

    /**
     * 查询病例诊治处理列表
     */
    @PreAuthorize("@ss.hasPermi('report:treatment:list')")
    @GetMapping("/list")
    public TableDataInfo list(CaseDiagnosisTreatment caseDiagnosisTreatment)
    {
        startPage();
        List<CaseDiagnosisTreatment> list = caseDiagnosisTreatmentService.selectCaseDiagnosisTreatmentList(caseDiagnosisTreatment);
        return getDataTable(list);
    }

    /**
     * 导出病例诊治处理列表
     */
    @PreAuthorize("@ss.hasPermi('report:treatment:export')")
    @Log(title = "病例诊治处理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CaseDiagnosisTreatment caseDiagnosisTreatment)
    {
        List<CaseDiagnosisTreatment> list = caseDiagnosisTreatmentService.selectCaseDiagnosisTreatmentList(caseDiagnosisTreatment);
        ExcelUtil<CaseDiagnosisTreatment> util = new ExcelUtil<CaseDiagnosisTreatment>(CaseDiagnosisTreatment.class);
        util.exportExcel(response, list, "病例诊治处理数据");
    }

    /**
     * 获取病例诊治处理详细信息
     */
    @PreAuthorize("@ss.hasPermi('report:treatment:query')")
    @GetMapping(value = "/{diagId}")
    public AjaxResult getInfo(@PathVariable("diagId") Long diagId)
    {
        return success(caseDiagnosisTreatmentService.selectCaseDiagnosisTreatmentByDiagId(diagId));
    }

    /**
     * 新增病例诊治处理
     */
    @PreAuthorize("@ss.hasPermi('report:treatment:add')")
    @Log(title = "病例诊治处理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CaseDiagnosisTreatment caseDiagnosisTreatment)
    {
        return toAjax(caseDiagnosisTreatmentService.insertCaseDiagnosisTreatment(caseDiagnosisTreatment));
    }

    /**
     * 修改病例诊治处理
     */
    @PreAuthorize("@ss.hasPermi('report:treatment:edit')")
    @Log(title = "病例诊治处理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CaseDiagnosisTreatment caseDiagnosisTreatment)
    {
        return toAjax(caseDiagnosisTreatmentService.updateCaseDiagnosisTreatment(caseDiagnosisTreatment));
    }

    /**
     * 删除病例诊治处理
     */
    @PreAuthorize("@ss.hasPermi('report:treatment:remove')")
    @Log(title = "病例诊治处理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{diagIds}")
    public AjaxResult remove(@PathVariable Long[] diagIds)
    {
        return toAjax(caseDiagnosisTreatmentService.deleteCaseDiagnosisTreatmentByDiagIds(diagIds));
    }
}
