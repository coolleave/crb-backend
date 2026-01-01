package com.coolleave.report.service.impl;

import java.util.List;
import com.coolleave.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.coolleave.report.mapper.CaseBaseMapper;
import com.coolleave.report.domain.CaseBase;
import com.coolleave.report.service.ICaseBaseService;

/**
 * 病例基础信息Service业务层处理
 * 
 * @author coolleave
 * @date 2025-12-31
 */
@Service
public class CaseBaseServiceImpl implements ICaseBaseService 
{
    @Autowired
    private CaseBaseMapper caseBaseMapper;

    /**
     * 查询病例基础信息
     * 
     * @param caseId 病例基础信息主键
     * @return 病例基础信息
     */
    @Override
    public CaseBase selectCaseBaseByCaseId(Long caseId)
    {
        return caseBaseMapper.selectCaseBaseByCaseId(caseId);
    }

    /**
     * 查询病例基础信息列表
     * 
     * @param caseBase 病例基础信息
     * @return 病例基础信息
     */
    @Override
    public List<CaseBase> selectCaseBaseList(CaseBase caseBase)
    {
        return caseBaseMapper.selectCaseBaseList(caseBase);
    }

    /**
     * 新增病例基础信息
     * 
     * @param caseBase 病例基础信息
     * @return 结果
     */
    @Override
    public int insertCaseBase(CaseBase caseBase)
    {
        caseBase.setCreateTime(DateUtils.getNowDate());
        return caseBaseMapper.insertCaseBase(caseBase);
    }

    /**
     * 修改病例基础信息
     * 
     * @param caseBase 病例基础信息
     * @return 结果
     */
    @Override
    public int updateCaseBase(CaseBase caseBase)
    {
        caseBase.setUpdateTime(DateUtils.getNowDate());
        return caseBaseMapper.updateCaseBase(caseBase);
    }

    /**
     * 批量删除病例基础信息
     * 
     * @param caseIds 需要删除的病例基础信息主键
     * @return 结果
     */
    @Override
    public int deleteCaseBaseByCaseIds(Long[] caseIds)
    {
        return caseBaseMapper.deleteCaseBaseByCaseIds(caseIds);
    }

    /**
     * 删除病例基础信息信息
     * 
     * @param caseId 病例基础信息主键
     * @return 结果
     */
    @Override
    public int deleteCaseBaseByCaseId(Long caseId)
    {
        return caseBaseMapper.deleteCaseBaseByCaseId(caseId);
    }
}
