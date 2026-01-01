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
import com.coolleave.report.domain.CaseTrackContact;
import com.coolleave.report.service.ICaseTrackContactService;
import com.coolleave.common.utils.poi.ExcelUtil;
import com.coolleave.common.core.page.TableDataInfo;

/**
 * 病例轨迹与接触人群Controller
 * 
 * @author coolleave
 * @date 2026-01-01
 */
@RestController
@RequestMapping("/report/contact")
public class CaseTrackContactController extends BaseController
{
    @Autowired
    private ICaseTrackContactService caseTrackContactService;

    /**
     * 查询病例轨迹与接触人群列表
     */
    @PreAuthorize("@ss.hasPermi('report:contact:list')")
    @GetMapping("/list")
    public TableDataInfo list(CaseTrackContact caseTrackContact)
    {
        startPage();
        List<CaseTrackContact> list = caseTrackContactService.selectCaseTrackContactList(caseTrackContact);
        return getDataTable(list);
    }

    /**
     * 导出病例轨迹与接触人群列表
     */
    @PreAuthorize("@ss.hasPermi('report:contact:export')")
    @Log(title = "病例轨迹与接触人群", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CaseTrackContact caseTrackContact)
    {
        List<CaseTrackContact> list = caseTrackContactService.selectCaseTrackContactList(caseTrackContact);
        ExcelUtil<CaseTrackContact> util = new ExcelUtil<CaseTrackContact>(CaseTrackContact.class);
        util.exportExcel(response, list, "病例轨迹与接触人群数据");
    }

    /**
     * 获取病例轨迹与接触人群详细信息
     */
    @PreAuthorize("@ss.hasPermi('report:contact:query')")
    @GetMapping(value = "/{trackId}")
    public AjaxResult getInfo(@PathVariable("trackId") Long trackId)
    {
        return success(caseTrackContactService.selectCaseTrackContactByTrackId(trackId));
    }

    /**
     * 新增病例轨迹与接触人群
     */
    @PreAuthorize("@ss.hasPermi('report:contact:add')")
    @Log(title = "病例轨迹与接触人群", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CaseTrackContact caseTrackContact)
    {
        return toAjax(caseTrackContactService.insertCaseTrackContact(caseTrackContact));
    }

    /**
     * 修改病例轨迹与接触人群
     */
    @PreAuthorize("@ss.hasPermi('report:contact:edit')")
    @Log(title = "病例轨迹与接触人群", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CaseTrackContact caseTrackContact)
    {
        return toAjax(caseTrackContactService.updateCaseTrackContact(caseTrackContact));
    }

    /**
     * 删除病例轨迹与接触人群
     */
    @PreAuthorize("@ss.hasPermi('report:contact:remove')")
    @Log(title = "病例轨迹与接触人群", businessType = BusinessType.DELETE)
	@DeleteMapping("/{trackIds}")
    public AjaxResult remove(@PathVariable Long[] trackIds)
    {
        return toAjax(caseTrackContactService.deleteCaseTrackContactByTrackIds(trackIds));
    }
}
