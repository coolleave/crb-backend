package com.coolleave.report.service;

import java.util.List;
import com.coolleave.report.domain.MedicalStaff;

/**
 * 人员信息
Service接口
 * 
 * @author coolleave
 * @date 2026-01-04
 */
public interface IMedicalStaffService 
{
    /**
     * 查询人员信息

     * 
     * @param medId 人员信息
主键
     * @return 人员信息

     */
    public MedicalStaff selectMedicalStaffByMedId(Long medId);

    /**
     * 查询人员信息
列表
     * 
     * @param medicalStaff 人员信息

     * @return 人员信息
集合
     */
    public List<MedicalStaff> selectMedicalStaffList(MedicalStaff medicalStaff);

    /**
     * 新增人员信息

     * 
     * @param medicalStaff 人员信息

     * @return 结果
     */
    public int insertMedicalStaff(MedicalStaff medicalStaff);

    /**
     * 修改人员信息

     * 
     * @param medicalStaff 人员信息

     * @return 结果
     */
    public int updateMedicalStaff(MedicalStaff medicalStaff);

    /**
     * 批量删除人员信息

     * 
     * @param medIds 需要删除的人员信息
主键集合
     * @return 结果
     */
    public int deleteMedicalStaffByMedIds(Long[] medIds);

    /**
     * 删除人员信息
信息
     * 
     * @param medId 人员信息
主键
     * @return 结果
     */
    public int deleteMedicalStaffByMedId(Long medId);
}
