package com.coolleave.report.mapper;

import java.util.List;
import com.coolleave.report.domain.CaseBase;

/**
 * 病例基础信息Mapper接口
 * 
 * @author coolleave
 * @date 2025-12-31
 */
public interface CaseBaseMapper 
{
    /**
     * 查询病例基础信息
     * 
     * @param caseId 病例基础信息主键
     * @return 病例基础信息
     */
    public CaseBase selectCaseBaseByCaseId(Long caseId);

    /**
     * 查询病例基础信息列表
     * 
     * @param caseBase 病例基础信息
     * @return 病例基础信息集合
     */
    public List<CaseBase> selectCaseBaseList(CaseBase caseBase);

    /**
     * 新增病例基础信息
     * 
     * @param caseBase 病例基础信息
     * @return 结果
     */
    public int insertCaseBase(CaseBase caseBase);

    /**
     * 修改病例基础信息
     * 
     * @param caseBase 病例基础信息
     * @return 结果
     */
    public int updateCaseBase(CaseBase caseBase);

    /**
     * 删除病例基础信息
     * 
     * @param caseId 病例基础信息主键
     * @return 结果
     */
    public int deleteCaseBaseByCaseId(Long caseId);

    /**
     * 批量删除病例基础信息
     * 
     * @param caseIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCaseBaseByCaseIds(Long[] caseIds);
}
