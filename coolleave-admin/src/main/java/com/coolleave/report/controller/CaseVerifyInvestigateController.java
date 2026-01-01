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
import com.coolleave.report.domain.CaseVerifyInvestigate;
import com.coolleave.report.service.ICaseVerifyInvestigateService;
import com.coolleave.common.utils.poi.ExcelUtil;
import com.coolleave.common.core.page.TableDataInfo;

/**
 * 上报数据核实诊断与调查处理Controller
 * 
 * @author coolleave
 * @date 2026-01-01
 */
@RestController
@RequestMapping("/report/investigate")
public class CaseVerifyInvestigateController extends BaseController
{
    @Autowired
    private ICaseVerifyInvestigateService caseVerifyInvestigateService;

    /**
     * 查询上报数据核实诊断与调查处理列表
     */
    @PreAuthorize("@ss.hasPermi('report:investigate:list')")
    @GetMapping("/list")
    public TableDataInfo list(CaseVerifyInvestigate caseVerifyInvestigate)
    {
        startPage();
        List<CaseVerifyInvestigate> list = caseVerifyInvestigateService.selectCaseVerifyInvestigateList(caseVerifyInvestigate);
        return getDataTable(list);
    }

    /**
     * 导出上报数据核实诊断与调查处理列表
     */
    @PreAuthorize("@ss.hasPermi('report:investigate:export')")
    @Log(title = "上报数据核实诊断与调查处理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CaseVerifyInvestigate caseVerifyInvestigate)
    {
        List<CaseVerifyInvestigate> list = caseVerifyInvestigateService.selectCaseVerifyInvestigateList(caseVerifyInvestigate);
        ExcelUtil<CaseVerifyInvestigate> util = new ExcelUtil<CaseVerifyInvestigate>(CaseVerifyInvestigate.class);
        util.exportExcel(response, list, "上报数据核实诊断与调查处理数据");
    }

    /**
     * 获取上报数据核实诊断与调查处理详细信息
     */
    @PreAuthorize("@ss.hasPermi('report:investigate:query')")
    @GetMapping(value = "/{verifyId}")
    public AjaxResult getInfo(@PathVariable("verifyId") Long verifyId)
    {
        return success(caseVerifyInvestigateService.selectCaseVerifyInvestigateByVerifyId(verifyId));
    }

    /**
     * 新增上报数据核实诊断与调查处理
     */
    @PreAuthorize("@ss.hasPermi('report:investigate:add')")
    @Log(title = "上报数据核实诊断与调查处理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CaseVerifyInvestigate caseVerifyInvestigate)
    {
        return toAjax(caseVerifyInvestigateService.insertCaseVerifyInvestigate(caseVerifyInvestigate));
    }

    /**
     * 修改上报数据核实诊断与调查处理
     */
    @PreAuthorize("@ss.hasPermi('report:investigate:edit')")
    @Log(title = "上报数据核实诊断与调查处理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CaseVerifyInvestigate caseVerifyInvestigate)
    {
        return toAjax(caseVerifyInvestigateService.updateCaseVerifyInvestigate(caseVerifyInvestigate));
    }

    /**
     * 删除上报数据核实诊断与调查处理
     */
    @PreAuthorize("@ss.hasPermi('report:investigate:remove')")
    @Log(title = "上报数据核实诊断与调查处理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{verifyIds}")
    public AjaxResult remove(@PathVariable Long[] verifyIds)
    {
        return toAjax(caseVerifyInvestigateService.deleteCaseVerifyInvestigateByVerifyIds(verifyIds));
    }
}
