package com.coolleave.report.mapper;

import java.util.List;
import com.coolleave.report.domain.CaseVerifyInvestigate;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * 上报数据核实诊断与调查处理Mapper接口
 * 
 * @author coolleave
 * @date 2026-01-01
 */
public interface CaseVerifyInvestigateMapper 
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
     * 删除上报数据核实诊断与调查处理
     * 
     * @param verifyId 上报数据核实诊断与调查处理主键
     * @return 结果
     */
    public int deleteCaseVerifyInvestigateByVerifyId(Long verifyId);

    /**
     * 批量删除上报数据核实诊断与调查处理
     * 
     * @param verifyIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCaseVerifyInvestigateByVerifyIds(Long[] verifyIds);

    @Update("UPDATE case_base SET case_status = #{caseVerifyInvestigate.verifyResult} WHERE case_code = #{caseVerifyInvestigate.caseId}")
    void updateBaseVerifyStatus(@Param("caseVerifyInvestigate") CaseVerifyInvestigate caseVerifyInvestigate);
}
