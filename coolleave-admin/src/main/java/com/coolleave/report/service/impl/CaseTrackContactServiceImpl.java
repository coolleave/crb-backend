package com.coolleave.report.service.impl;

import java.util.List;
import com.coolleave.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.coolleave.report.mapper.CaseTrackContactMapper;
import com.coolleave.report.domain.CaseTrackContact;
import com.coolleave.report.service.ICaseTrackContactService;

/**
 * 病例轨迹与接触人群Service业务层处理
 * 
 * @author coolleave
 * @date 2026-01-01
 */
@Service
public class CaseTrackContactServiceImpl implements ICaseTrackContactService 
{
    @Autowired
    private CaseTrackContactMapper caseTrackContactMapper;

    /**
     * 查询病例轨迹与接触人群
     * 
     * @param trackId 病例轨迹与接触人群主键
     * @return 病例轨迹与接触人群
     */
    @Override
    public CaseTrackContact selectCaseTrackContactByTrackId(Long trackId)
    {
        return caseTrackContactMapper.selectCaseTrackContactByTrackId(trackId);
    }

    /**
     * 查询病例轨迹与接触人群列表
     * 
     * @param caseTrackContact 病例轨迹与接触人群
     * @return 病例轨迹与接触人群
     */
    @Override
    public List<CaseTrackContact> selectCaseTrackContactList(CaseTrackContact caseTrackContact)
    {
        return caseTrackContactMapper.selectCaseTrackContactList(caseTrackContact);
    }

    /**
     * 新增病例轨迹与接触人群
     * 
     * @param caseTrackContact 病例轨迹与接触人群
     * @return 结果
     */
    @Override
    public int insertCaseTrackContact(CaseTrackContact caseTrackContact)
    {
        caseTrackContact.setCreateTime(DateUtils.getNowDate());
        return caseTrackContactMapper.insertCaseTrackContact(caseTrackContact);
    }

    /**
     * 修改病例轨迹与接触人群
     * 
     * @param caseTrackContact 病例轨迹与接触人群
     * @return 结果
     */
    @Override
    public int updateCaseTrackContact(CaseTrackContact caseTrackContact)
    {
        return caseTrackContactMapper.updateCaseTrackContact(caseTrackContact);
    }

    /**
     * 批量删除病例轨迹与接触人群
     * 
     * @param trackIds 需要删除的病例轨迹与接触人群主键
     * @return 结果
     */
    @Override
    public int deleteCaseTrackContactByTrackIds(Long[] trackIds)
    {
        return caseTrackContactMapper.deleteCaseTrackContactByTrackIds(trackIds);
    }

    /**
     * 删除病例轨迹与接触人群信息
     * 
     * @param trackId 病例轨迹与接触人群主键
     * @return 结果
     */
    @Override
    public int deleteCaseTrackContactByTrackId(Long trackId)
    {
        return caseTrackContactMapper.deleteCaseTrackContactByTrackId(trackId);
    }
}
