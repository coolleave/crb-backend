package com.coolleave.report.domain;

import java.util.Date;

import com.coolleave.common.core.domain.BaseEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.coolleave.common.annotation.Excel;

/**
 * 病例基础信息对象 case_base
 * 
 * @author coolleave
 * @date 2025-12-31
 */
public class CaseBase extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 病例ID */
    private Long caseId;

    /** 病例编号 */
    @Excel(name = "病例编号")
    private String caseCode;

    /** 传染病 */
    @Excel(name = "传染病")
    private Long infectId;

    /** 上报类型 */
    @Excel(name = "上报类型")
    private Integer reportType;

    /** 患者姓名 */
    @Excel(name = "患者姓名")
    private String patientName;

    /** 性别 */
    @Excel(name = "性别")
    private Integer patientGender;

    /** 患者年龄 */
    @Excel(name = "患者年龄")
    private Long patientAge;

    /** 患者身份证号 */
    @Excel(name = "患者身份证号")
    private String patientIdcard;

    /** 患者手机号 */
    @Excel(name = "患者手机号")
    private String patientPhone;

    /** 患者所在省份 */
    @Excel(name = "患者所在省份")
    private String province;

    /** 患者所在城市 */
    @Excel(name = "患者所在城市")
    private String city;

    /** 患者所在区县 */
    @Excel(name = "患者所在区县")
    private String district;

    /** 患者详细住址 */
    @Excel(name = "患者详细住址")
    private String detailAddress;

    /** 发病时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "发病时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date onsetDatetime;

    /** 上报时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "上报时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date reportDatetime;

    /** 上报医务人员 */
    @Excel(name = "上报医务人员")
    private Long reporterId;

    /** 上报机构 */
    @Excel(name = "上报机构")
    private Long reportDeptId;

    /** 核实状态 */
    @Excel(name = "核实状态")
    private Integer caseStatus;

    /** 住院病区（仅住院上报填写） */
    @Excel(name = "住院病区", readConverterExp = "仅=住院上报填写")
    private String hospitalWard;

    /** 住院床位号（仅住院上报填写，如0102） */
    @Excel(name = "住院床位号", readConverterExp = "仅=住院上报填写，如0102")
    private String hospitalBed;

    public void setCaseId(Long caseId) 
    {
        this.caseId = caseId;
    }

    public Long getCaseId() 
    {
        return caseId;
    }

    public void setCaseCode(String caseCode) 
    {
        this.caseCode = caseCode;
    }

    public String getCaseCode() 
    {
        return caseCode;
    }

    public void setInfectId(Long infectId) 
    {
        this.infectId = infectId;
    }

    public Long getInfectId() 
    {
        return infectId;
    }

    public void setReportType(Integer reportType) 
    {
        this.reportType = reportType;
    }

    public Integer getReportType() 
    {
        return reportType;
    }

    public void setPatientName(String patientName) 
    {
        this.patientName = patientName;
    }

    public String getPatientName() 
    {
        return patientName;
    }

    public void setPatientGender(Integer patientGender) 
    {
        this.patientGender = patientGender;
    }

    public Integer getPatientGender() 
    {
        return patientGender;
    }

    public void setPatientAge(Long patientAge) 
    {
        this.patientAge = patientAge;
    }

    public Long getPatientAge() 
    {
        return patientAge;
    }

    public void setPatientIdcard(String patientIdcard) 
    {
        this.patientIdcard = patientIdcard;
    }

    public String getPatientIdcard() 
    {
        return patientIdcard;
    }

    public void setPatientPhone(String patientPhone) 
    {
        this.patientPhone = patientPhone;
    }

    public String getPatientPhone() 
    {
        return patientPhone;
    }

    public void setProvince(String province) 
    {
        this.province = province;
    }

    public String getProvince() 
    {
        return province;
    }

    public void setCity(String city) 
    {
        this.city = city;
    }

    public String getCity() 
    {
        return city;
    }

    public void setDistrict(String district) 
    {
        this.district = district;
    }

    public String getDistrict() 
    {
        return district;
    }

    public void setDetailAddress(String detailAddress) 
    {
        this.detailAddress = detailAddress;
    }

    public String getDetailAddress() 
    {
        return detailAddress;
    }

    public void setOnsetDatetime(Date onsetDatetime) 
    {
        this.onsetDatetime = onsetDatetime;
    }

    public Date getOnsetDatetime() 
    {
        return onsetDatetime;
    }

    public void setReportDatetime(Date reportDatetime) 
    {
        this.reportDatetime = reportDatetime;
    }

    public Date getReportDatetime() 
    {
        return reportDatetime;
    }

    public void setReporterId(Long reporterId) 
    {
        this.reporterId = reporterId;
    }

    public Long getReporterId() 
    {
        return reporterId;
    }

    public void setReportDeptId(Long reportDeptId) 
    {
        this.reportDeptId = reportDeptId;
    }

    public Long getReportDeptId() 
    {
        return reportDeptId;
    }

    public void setCaseStatus(Integer caseStatus) 
    {
        this.caseStatus = caseStatus;
    }

    public Integer getCaseStatus() 
    {
        return caseStatus;
    }

    public void setHospitalWard(String hospitalWard) 
    {
        this.hospitalWard = hospitalWard;
    }

    public String getHospitalWard() 
    {
        return hospitalWard;
    }

    public void setHospitalBed(String hospitalBed) 
    {
        this.hospitalBed = hospitalBed;
    }

    public String getHospitalBed() 
    {
        return hospitalBed;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("caseId", getCaseId())
            .append("caseCode", getCaseCode())
            .append("infectId", getInfectId())
            .append("reportType", getReportType())
            .append("patientName", getPatientName())
            .append("patientGender", getPatientGender())
            .append("patientAge", getPatientAge())
            .append("patientIdcard", getPatientIdcard())
            .append("patientPhone", getPatientPhone())
            .append("province", getProvince())
            .append("city", getCity())
            .append("district", getDistrict())
            .append("detailAddress", getDetailAddress())
            .append("onsetDatetime", getOnsetDatetime())
            .append("reportDatetime", getReportDatetime())
            .append("reporterId", getReporterId())
            .append("reportDeptId", getReportDeptId())
            .append("caseStatus", getCaseStatus())
            .append("hospitalWard", getHospitalWard())
            .append("hospitalBed", getHospitalBed())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
