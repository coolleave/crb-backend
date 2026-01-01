package com.coolleave.report.service.impl;

import java.util.List;
import com.coolleave.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.coolleave.report.mapper.CaseDiagnosisTreatmentMapper;
import com.coolleave.report.domain.CaseDiagnosisTreatment;
import com.coolleave.report.service.ICaseDiagnosisTreatmentService;

/**
 * 病例诊治处理Service业务层处理
 * 
 * @author coolleave
 * @date 2026-01-01
 */
@Service
public class CaseDiagnosisTreatmentServiceImpl implements ICaseDiagnosisTreatmentService 
{
    @Autowired
    private CaseDiagnosisTreatmentMapper caseDiagnosisTreatmentMapper;

    /**
     * 查询病例诊治处理
     * 
     * @param diagId 病例诊治处理主键
     * @return 病例诊治处理
     */
    @Override
    public CaseDiagnosisTreatment selectCaseDiagnosisTreatmentByDiagId(Long diagId)
    {
        return caseDiagnosisTreatmentMapper.selectCaseDiagnosisTreatmentByDiagId(diagId);
    }

    /**
     * 查询病例诊治处理列表
     * 
     * @param caseDiagnosisTreatment 病例诊治处理
     * @return 病例诊治处理
     */
    @Override
    public List<CaseDiagnosisTreatment> selectCaseDiagnosisTreatmentList(CaseDiagnosisTreatment caseDiagnosisTreatment)
    {
        return caseDiagnosisTreatmentMapper.selectCaseDiagnosisTreatmentList(caseDiagnosisTreatment);
    }

    /**
     * 新增病例诊治处理
     * 
     * @param caseDiagnosisTreatment 病例诊治处理
     * @return 结果
     */
    @Override
    public int insertCaseDiagnosisTreatment(CaseDiagnosisTreatment caseDiagnosisTreatment)
    {
        caseDiagnosisTreatment.setCreateTime(DateUtils.getNowDate());
        return caseDiagnosisTreatmentMapper.insertCaseDiagnosisTreatment(caseDiagnosisTreatment);
    }

    /**
     * 修改病例诊治处理
     * 
     * @param caseDiagnosisTreatment 病例诊治处理
     * @return 结果
     */
    @Override
    public int updateCaseDiagnosisTreatment(CaseDiagnosisTreatment caseDiagnosisTreatment)
    {
        caseDiagnosisTreatment.setUpdateTime(DateUtils.getNowDate());
        return caseDiagnosisTreatmentMapper.updateCaseDiagnosisTreatment(caseDiagnosisTreatment);
    }

    /**
     * 批量删除病例诊治处理
     * 
     * @param diagIds 需要删除的病例诊治处理主键
     * @return 结果
     */
    @Override
    public int deleteCaseDiagnosisTreatmentByDiagIds(Long[] diagIds)
    {
        return caseDiagnosisTreatmentMapper.deleteCaseDiagnosisTreatmentByDiagIds(diagIds);
    }

    /**
     * 删除病例诊治处理信息
     * 
     * @param diagId 病例诊治处理主键
     * @return 结果
     */
    @Override
    public int deleteCaseDiagnosisTreatmentByDiagId(Long diagId)
    {
        return caseDiagnosisTreatmentMapper.deleteCaseDiagnosisTreatmentByDiagId(diagId);
    }
}
