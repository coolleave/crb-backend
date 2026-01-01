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
import com.coolleave.report.domain.CaseBase;
import com.coolleave.report.service.ICaseBaseService;
import com.coolleave.common.utils.poi.ExcelUtil;
import com.coolleave.common.core.page.TableDataInfo;

/**
 * 病例基础信息Controller
 * 
 * @author coolleave
 * @date 2025-12-31
 */
@RestController
@RequestMapping("/report/report")
public class CaseBaseController extends BaseController
{
    @Autowired
    private ICaseBaseService caseBaseService;

    /**
     * 查询病例基础信息列表
     */
    @PreAuthorize("@ss.hasPermi('report:report:list')")
    @GetMapping("/list")
    public TableDataInfo list(CaseBase caseBase)
    {
        startPage();
        List<CaseBase> list = caseBaseService.selectCaseBaseList(caseBase);
        return getDataTable(list);
    }

    /**
     * 导出病例基础信息列表
     */
    @PreAuthorize("@ss.hasPermi('report:report:export')")
    @Log(title = "病例基础信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CaseBase caseBase)
    {
        List<CaseBase> list = caseBaseService.selectCaseBaseList(caseBase);
        ExcelUtil<CaseBase> util = new ExcelUtil<CaseBase>(CaseBase.class);
        util.exportExcel(response, list, "病例基础信息数据");
    }

    /**
     * 获取病例基础信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('report:report:query')")
    @GetMapping(value = "/{caseId}")
    public AjaxResult getInfo(@PathVariable("caseId") Long caseId)
    {
        return success(caseBaseService.selectCaseBaseByCaseId(caseId));
    }

    /**
     * 新增病例基础信息
     */
    @PreAuthorize("@ss.hasPermi('report:report:add')")
    @Log(title = "病例基础信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CaseBase caseBase)
    {
        return toAjax(caseBaseService.insertCaseBase(caseBase));
    }

    /**
     * 修改病例基础信息
     */
    @PreAuthorize("@ss.hasPermi('report:report:edit')")
    @Log(title = "病例基础信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CaseBase caseBase)
    {
        return toAjax(caseBaseService.updateCaseBase(caseBase));
    }

    /**
     * 删除病例基础信息
     */
    @PreAuthorize("@ss.hasPermi('report:report:remove')")
    @Log(title = "病例基础信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{caseIds}")
    public AjaxResult remove(@PathVariable Long[] caseIds)
    {
        return toAjax(caseBaseService.deleteCaseBaseByCaseIds(caseIds));
    }
}
