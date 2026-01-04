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
import com.coolleave.report.domain.HealthDept;
import com.coolleave.report.service.IHealthDeptService;
import com.coolleave.common.utils.poi.ExcelUtil;
import com.coolleave.common.core.page.TableDataInfo;

/**
 * 卫生机构/部门信息Controller
 * 
 * @author coolleave
 * @date 2026-01-04
 */
@RestController
@RequestMapping("/report/dept")
public class HealthDeptController extends BaseController
{
    @Autowired
    private IHealthDeptService healthDeptService;

    /**
     * 查询卫生机构/部门信息列表
     */
    @PreAuthorize("@ss.hasPermi('report:dept:list')")
    @GetMapping("/list")
    public TableDataInfo list(HealthDept healthDept)
    {
        startPage();
        List<HealthDept> list = healthDeptService.selectHealthDeptList(healthDept);
        return getDataTable(list);
    }

    /**
     * 导出卫生机构/部门信息列表
     */
    @PreAuthorize("@ss.hasPermi('report:dept:export')")
    @Log(title = "卫生机构/部门信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, HealthDept healthDept)
    {
        List<HealthDept> list = healthDeptService.selectHealthDeptList(healthDept);
        ExcelUtil<HealthDept> util = new ExcelUtil<HealthDept>(HealthDept.class);
        util.exportExcel(response, list, "卫生机构/部门信息数据");
    }

    /**
     * 获取卫生机构/部门信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('report:dept:query')")
    @GetMapping(value = "/{deptId}")
    public AjaxResult getInfo(@PathVariable("deptId") Long deptId)
    {
        return success(healthDeptService.selectHealthDeptByDeptId(deptId));
    }

    /**
     * 新增卫生机构/部门信息
     */
    @PreAuthorize("@ss.hasPermi('report:dept:add')")
    @Log(title = "卫生机构/部门信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HealthDept healthDept)
    {
        return toAjax(healthDeptService.insertHealthDept(healthDept));
    }

    /**
     * 修改卫生机构/部门信息
     */
    @PreAuthorize("@ss.hasPermi('report:dept:edit')")
    @Log(title = "卫生机构/部门信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HealthDept healthDept)
    {
        return toAjax(healthDeptService.updateHealthDept(healthDept));
    }

    /**
     * 删除卫生机构/部门信息
     */
    @PreAuthorize("@ss.hasPermi('report:dept:remove')")
    @Log(title = "卫生机构/部门信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{deptIds}")
    public AjaxResult remove(@PathVariable Long[] deptIds)
    {
        return toAjax(healthDeptService.deleteHealthDeptByDeptIds(deptIds));
    }
}
