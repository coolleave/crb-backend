package com.coolleave.report.mapper;

import java.util.List;
import com.coolleave.report.domain.CaseTrackContact;

/**
 * 病例轨迹与接触人群Mapper接口
 * 
 * @author coolleave
 * @date 2026-01-01
 */
public interface CaseTrackContactMapper 
{
    /**
     * 查询病例轨迹与接触人群
     * 
     * @param trackId 病例轨迹与接触人群主键
     * @return 病例轨迹与接触人群
     */
    public CaseTrackContact selectCaseTrackContactByTrackId(Long trackId);

    /**
     * 查询病例轨迹与接触人群列表
     * 
     * @param caseTrackContact 病例轨迹与接触人群
     * @return 病例轨迹与接触人群集合
     */
    public List<CaseTrackContact> selectCaseTrackContactList(CaseTrackContact caseTrackContact);

    /**
     * 新增病例轨迹与接触人群
     * 
     * @param caseTrackContact 病例轨迹与接触人群
     * @return 结果
     */
    public int insertCaseTrackContact(CaseTrackContact caseTrackContact);

    /**
     * 修改病例轨迹与接触人群
     * 
     * @param caseTrackContact 病例轨迹与接触人群
     * @return 结果
     */
    public int updateCaseTrackContact(CaseTrackContact caseTrackContact);

    /**
     * 删除病例轨迹与接触人群
     * 
     * @param trackId 病例轨迹与接触人群主键
     * @return 结果
     */
    public int deleteCaseTrackContactByTrackId(Long trackId);

    /**
     * 批量删除病例轨迹与接触人群
     * 
     * @param trackIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCaseTrackContactByTrackIds(Long[] trackIds);
}
