package com.coolleave.report.domain;

import com.coolleave.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.coolleave.common.annotation.Excel;

/**
 * 人员信息
对象 medical_staff
 * 
 * @author coolleave
 * @date 2026-01-04
 */
public class MedicalStaff extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 医务人员ID */
    private Long medId;

    /** 医务人员姓名 */
    @Excel(name = "医务人员姓名")
    private String medName;

    /** 所属机构ID */
    @Excel(name = "所属机构ID")
    private Long medDeptId;

    /** 医师资格证号（15位固定） */
    @Excel(name = "医师资格证号", readConverterExp = "1=5位固定")
    private String medLicense;

    /** 联系电话 */
    @Excel(name = "联系电话")
    private String medPhone;

    public void setMedId(Long medId) 
    {
        this.medId = medId;
    }

    public Long getMedId() 
    {
        return medId;
    }

    public void setMedName(String medName) 
    {
        this.medName = medName;
    }

    public String getMedName() 
    {
        return medName;
    }

    public void setMedDeptId(Long medDeptId) 
    {
        this.medDeptId = medDeptId;
    }

    public Long getMedDeptId() 
    {
        return medDeptId;
    }

    public void setMedLicense(String medLicense) 
    {
        this.medLicense = medLicense;
    }

    public String getMedLicense() 
    {
        return medLicense;
    }

    public void setMedPhone(String medPhone) 
    {
        this.medPhone = medPhone;
    }

    public String getMedPhone() 
    {
        return medPhone;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("medId", getMedId())
            .append("medName", getMedName())
            .append("medDeptId", getMedDeptId())
            .append("medLicense", getMedLicense())
            .append("medPhone", getMedPhone())
            .toString();
    }
}
