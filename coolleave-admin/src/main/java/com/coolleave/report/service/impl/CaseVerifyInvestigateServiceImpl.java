package com.coolleave.report.service.impl;

import java.util.List;
import com.coolleave.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.coolleave.report.mapper.CaseVerifyInvestigateMapper;
import com.coolleave.report.domain.CaseVerifyInvestigate;
import com.coolleave.report.service.ICaseVerifyInvestigateService;

/**
 * 上报数据核实诊断与调查处理Service业务层处理
 * 
 * @author coolleave
 * @date 2026-01-01
 */
@Service
public class CaseVerifyInvestigateServiceImpl implements ICaseVerifyInvestigateService 
{
    @Autowired
    private CaseVerifyInvestigateMapper caseVerifyInvestigateMapper;

    /**
     * 查询上报数据核实诊断与调查处理
     * 
     * @param verifyId 上报数据核实诊断与调查处理主键
     * @return 上报数据核实诊断与调查处理
     */
    @Override
    public CaseVerifyInvestigate selectCaseVerifyInvestigateByVerifyId(Long verifyId)
    {
        return caseVerifyInvestigateMapper.selectCaseVerifyInvestigateByVerifyId(verifyId);
    }

    /**
     * 查询上报数据核实诊断与调查处理列表
     * 
     * @param caseVerifyInvestigate 上报数据核实诊断与调查处理
     * @return 上报数据核实诊断与调查处理
     */
    @Override
    public List<CaseVerifyInvestigate> selectCaseVerifyInvestigateList(CaseVerifyInvestigate caseVerifyInvestigate)
    {
        return caseVerifyInvestigateMapper.selectCaseVerifyInvestigateList(caseVerifyInvestigate);
    }

    /**
     * 新增上报数据核实诊断与调查处理
     * 
     * @param caseVerifyInvestigate 上报数据核实诊断与调查处理
     * @return 结果
     */
    @Override
    public int insertCaseVerifyInvestigate(CaseVerifyInvestigate caseVerifyInvestigate)
    {
        caseVerifyInvestigate.setCreateTime(DateUtils.getNowDate());
        return caseVerifyInvestigateMapper.insertCaseVerifyInvestigate(caseVerifyInvestigate);
    }

    /**
     * 修改上报数据核实诊断与调查处理
     * 
     * @param caseVerifyInvestigate 上报数据核实诊断与调查处理
     * @return 结果
     */
    @Override
    public int updateCaseVerifyInvestigate(CaseVerifyInvestigate caseVerifyInvestigate)
    {
        caseVerifyInvestigate.setUpdateTime(DateUtils.getNowDate());
        return caseVerifyInvestigateMapper.updateCaseVerifyInvestigate(caseVerifyInvestigate);
    }

    /**
     * 批量删除上报数据核实诊断与调查处理
     * 
     * @param verifyIds 需要删除的上报数据核实诊断与调查处理主键
     * @return 结果
     */
    @Override
    public int deleteCaseVerifyInvestigateByVerifyIds(Long[] verifyIds)
    {
        return caseVerifyInvestigateMapper.deleteCaseVerifyInvestigateByVerifyIds(verifyIds);
    }

    /**
     * 删除上报数据核实诊断与调查处理信息
     * 
     * @param verifyId 上报数据核实诊断与调查处理主键
     * @return 结果
     */
    @Override
    public int deleteCaseVerifyInvestigateByVerifyId(Long verifyId)
    {
        return caseVerifyInvestigateMapper.deleteCaseVerifyInvestigateByVerifyId(verifyId);
    }
}
