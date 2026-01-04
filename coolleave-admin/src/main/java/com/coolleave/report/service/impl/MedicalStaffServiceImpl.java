package com.coolleave.report.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.coolleave.report.mapper.MedicalStaffMapper;
import com.coolleave.report.domain.MedicalStaff;
import com.coolleave.report.service.IMedicalStaffService;

/**
 * 人员信息
Service业务层处理
 * 
 * @author coolleave
 * @date 2026-01-04
 */
@Service
public class MedicalStaffServiceImpl implements IMedicalStaffService 
{
    @Autowired
    private MedicalStaffMapper medicalStaffMapper;

    /**
     * 查询人员信息

     * 
     * @param medId 人员信息
主键
     * @return 人员信息

     */
    @Override
    public MedicalStaff selectMedicalStaffByMedId(Long medId)
    {
        return medicalStaffMapper.selectMedicalStaffByMedId(medId);
    }

    /**
     * 查询人员信息
列表
     * 
     * @param medicalStaff 人员信息

     * @return 人员信息

     */
    @Override
    public List<MedicalStaff> selectMedicalStaffList(MedicalStaff medicalStaff)
    {
        return medicalStaffMapper.selectMedicalStaffList(medicalStaff);
    }

    /**
     * 新增人员信息

     * 
     * @param medicalStaff 人员信息

     * @return 结果
     */
    @Override
    public int insertMedicalStaff(MedicalStaff medicalStaff)
    {
        return medicalStaffMapper.insertMedicalStaff(medicalStaff);
    }

    /**
     * 修改人员信息

     * 
     * @param medicalStaff 人员信息

     * @return 结果
     */
    @Override
    public int updateMedicalStaff(MedicalStaff medicalStaff)
    {
        return medicalStaffMapper.updateMedicalStaff(medicalStaff);
    }

    /**
     * 批量删除人员信息

     * 
     * @param medIds 需要删除的人员信息
主键
     * @return 结果
     */
    @Override
    public int deleteMedicalStaffByMedIds(Long[] medIds)
    {
        return medicalStaffMapper.deleteMedicalStaffByMedIds(medIds);
    }

    /**
     * 删除人员信息
信息
     * 
     * @param medId 人员信息
主键
     * @return 结果
     */
    @Override
    public int deleteMedicalStaffByMedId(Long medId)
    {
        return medicalStaffMapper.deleteMedicalStaffByMedId(medId);
    }
}
