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
import com.coolleave.report.domain.MedicalStaff;
import com.coolleave.report.service.IMedicalStaffService;
import com.coolleave.common.utils.poi.ExcelUtil;
import com.coolleave.common.core.page.TableDataInfo;

/**
 * 人员信息
Controller
 * 
 * @author coolleave
 * @date 2026-01-04
 */
@RestController
@RequestMapping("/report/staff")
public class MedicalStaffController extends BaseController
{
    @Autowired
    private IMedicalStaffService medicalStaffService;

    /**
     * 查询人员信息
列表
     */
    @PreAuthorize("@ss.hasPermi('report:staff:list')")
    @GetMapping("/list")
    public TableDataInfo list(MedicalStaff medicalStaff)
    {
        startPage();
        List<MedicalStaff> list = medicalStaffService.selectMedicalStaffList(medicalStaff);
        return getDataTable(list);
    }

    /**
     * 导出人员信息
列表
     */
    @PreAuthorize("@ss.hasPermi('report:staff:export')")
    @Log(title = "人员信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, MedicalStaff medicalStaff)
    {
        List<MedicalStaff> list = medicalStaffService.selectMedicalStaffList(medicalStaff);
        ExcelUtil<MedicalStaff> util = new ExcelUtil<MedicalStaff>(MedicalStaff.class);
        util.exportExcel(response, list, "人员信息数据");
    }

    /**
     * 获取人员信息
详细信息
     */
    @PreAuthorize("@ss.hasPermi('report:staff:query')")
    @GetMapping(value = "/{medId}")
    public AjaxResult getInfo(@PathVariable("medId") Long medId)
    {
        return success(medicalStaffService.selectMedicalStaffByMedId(medId));
    }

    /**
     * 新增人员信息

     */
    @PreAuthorize("@ss.hasPermi('report:staff:add')")
    @Log(title = "人员信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MedicalStaff medicalStaff)
    {
        return toAjax(medicalStaffService.insertMedicalStaff(medicalStaff));
    }

    /**
     * 修改人员信息

     */
    @PreAuthorize("@ss.hasPermi('report:staff:edit')")
    @Log(title = "人员信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MedicalStaff medicalStaff)
    {
        return toAjax(medicalStaffService.updateMedicalStaff(medicalStaff));
    }

    /**
     * 删除人员信息

     */
    @PreAuthorize("@ss.hasPermi('report:staff:remove')")
    @Log(title = "人员信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{medIds}")
    public AjaxResult remove(@PathVariable Long[] medIds)
    {
        return toAjax(medicalStaffService.deleteMedicalStaffByMedIds(medIds));
    }
}
