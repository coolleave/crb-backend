package com.coolleave.report.mapper;

import java.util.List;
import com.coolleave.report.domain.CaseDiagnosisTreatment;

/**
 * 病例诊治处理Mapper接口
 * 
 * @author coolleave
 * @date 2026-01-01
 */
public interface CaseDiagnosisTreatmentMapper 
{
    /**
     * 查询病例诊治处理
     * 
     * @param diagId 病例诊治处理主键
     * @return 病例诊治处理
     */
    public CaseDiagnosisTreatment selectCaseDiagnosisTreatmentByDiagId(Long diagId);

    /**
     * 查询病例诊治处理列表
     * 
     * @param caseDiagnosisTreatment 病例诊治处理
     * @return 病例诊治处理集合
     */
    public List<CaseDiagnosisTreatment> selectCaseDiagnosisTreatmentList(CaseDiagnosisTreatment caseDiagnosisTreatment);

    /**
     * 新增病例诊治处理
     * 
     * @param caseDiagnosisTreatment 病例诊治处理
     * @return 结果
     */
    public int insertCaseDiagnosisTreatment(CaseDiagnosisTreatment caseDiagnosisTreatment);

    /**
     * 修改病例诊治处理
     * 
     * @param caseDiagnosisTreatment 病例诊治处理
     * @return 结果
     */
    public int updateCaseDiagnosisTreatment(CaseDiagnosisTreatment caseDiagnosisTreatment);

    /**
     * 删除病例诊治处理
     * 
     * @param diagId 病例诊治处理主键
     * @return 结果
     */
    public int deleteCaseDiagnosisTreatmentByDiagId(Long diagId);

    /**
     * 批量删除病例诊治处理
     * 
     * @param diagIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCaseDiagnosisTreatmentByDiagIds(Long[] diagIds);
}
