package com.coolleave.report.service;

import java.util.List;
import com.coolleave.report.domain.CaseVerifyInvestigate;

/**
 * 上报数据核实诊断与调查处理Service接口
 * 
 * @author coolleave
 * @date 2026-01-01
 */
public interface ICaseVerifyInvestigateService 
{
    /**
     * 查询上报数据核实诊断与调查处理
     * 
     * @param verifyId 上报数据核实诊断与调查处理主键
     * @return 上报数据核实诊断与调查处理
     */
    public CaseVerifyInvestigate selectCaseVerifyInvestigateByVerifyId(Long verifyId);

    /**
     * 查询上报数据核实诊断与调查处理列表
     * 
     * @param caseVerifyInvestigate 上报数据核实诊断与调查处理
     * @return 上报数据核实诊断与调查处理集合
     */
    public List<CaseVerifyInvestigate> selectCaseVerifyInvestigateList(CaseVerifyInvestigate caseVerifyInvestigate);

    /**
     * 新增上报数据核实诊断与调查处理
     * 
     * @param caseVerifyInvestigate 上报数据核实诊断与调查处理
     * @return 结果
     */
    public int insertCaseVerifyInvestigate(CaseVerifyInvestigate caseVerifyInvestigate);

    /**
     * 修改上报数据核实诊断与调查处理
     * 
     * @param caseVerifyInvestigate 上报数据核实诊断与调查处理
     * @return 结果
     */
    public int updateCaseVerifyInvestigate(CaseVerifyInvestigate caseVerifyInvestigate);

    /**
     * 批量删除上报数据核实诊断与调查处理
     * 
     * @param verifyIds 需要删除的上报数据核实诊断与调查处理主键集合
     * @return 结果
     */
    public int deleteCaseVerifyInvestigateByVerifyIds(Long[] verifyIds);

    /**
     * 删除上报数据核实诊断与调查处理信息
     * 
     * @param verifyId 上报数据核实诊断与调查处理主键
     * @return 结果
     */
    public int deleteCaseVerifyInvestigateByVerifyId(Long verifyId);
}
