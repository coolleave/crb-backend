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
import com.coolleave.report.domain.InfectInfo;
import com.coolleave.report.service.IInfectInfoService;
import com.coolleave.common.utils.poi.ExcelUtil;
import com.coolleave.common.core.page.TableDataInfo;

/**
 * 传染病信息字典Controller
 * 
 * @author coolleave
 * @date 2025-12-31
 */
@RestController
@RequestMapping("/report/info")
public class InfectInfoController extends BaseController
{
    @Autowired
    private IInfectInfoService infectInfoService;

    /**
     * 查询传染病信息字典列表
     */
    @PreAuthorize("@ss.hasPermi('report:info:list')")
    @GetMapping("/list")
    public TableDataInfo list(InfectInfo infectInfo)
    {
        startPage();
        List<InfectInfo> list = infectInfoService.selectInfectInfoList(infectInfo);
        return getDataTable(list);
    }

    /**
     * 导出传染病信息字典列表
     */
    @PreAuthorize("@ss.hasPermi('report:info:export')")
    @Log(title = "传染病信息字典", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, InfectInfo infectInfo)
    {
        List<InfectInfo> list = infectInfoService.selectInfectInfoList(infectInfo);
        ExcelUtil<InfectInfo> util = new ExcelUtil<InfectInfo>(InfectInfo.class);
        util.exportExcel(response, list, "传染病信息字典数据");
    }

    /**
     * 获取传染病信息字典详细信息
     */
    @PreAuthorize("@ss.hasPermi('report:info:query')")
    @GetMapping(value = "/{infectId}")
    public AjaxResult getInfo(@PathVariable("infectId") Long infectId)
    {
        return success(infectInfoService.selectInfectInfoByInfectId(infectId));
    }

    /**
     * 新增传染病信息字典
     */
    @PreAuthorize("@ss.hasPermi('report:info:add')")
    @Log(title = "传染病信息字典", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody InfectInfo infectInfo)
    {
        return toAjax(infectInfoService.insertInfectInfo(infectInfo));
    }

    /**
     * 修改传染病信息字典
     */
    @PreAuthorize("@ss.hasPermi('report:info:edit')")
    @Log(title = "传染病信息字典", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody InfectInfo infectInfo)
    {
        return toAjax(infectInfoService.updateInfectInfo(infectInfo));
    }

    /**
     * 删除传染病信息字典
     */
    @PreAuthorize("@ss.hasPermi('report:info:remove')")
    @Log(title = "传染病信息字典", businessType = BusinessType.DELETE)
	@DeleteMapping("/{infectIds}")
    public AjaxResult remove(@PathVariable Long[] infectIds)
    {
        return toAjax(infectInfoService.deleteInfectInfoByInfectIds(infectIds));
    }
}
