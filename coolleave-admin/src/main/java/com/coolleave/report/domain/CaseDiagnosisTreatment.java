package com.coolleave.report.domain;

import java.util.Date;

import com.coolleave.common.core.domain.BaseEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.coolleave.common.annotation.Excel;

/**
 * 病例诊治处理对象 case_diagnosis_treatment
 * 
 * @author coolleave
 * @date 2026-01-01
 */
public class CaseDiagnosisTreatment extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 诊治ID */
    private Long diagId;

    /** 关联病例ID */
    @Excel(name = "关联病例ID")
    private Long caseId;

    /** 诊治医生姓名 */
    @Excel(name = "诊治医生姓名")
    private String diagDoctor;

    /** 诊断时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "诊断时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date diagDatetime;

    /** 诊断结果（如：新型冠状病毒肺炎（轻型）） */
    @Excel(name = "诊断结果", readConverterExp = "如=：新型冠状病毒肺炎（轻型")
    private String diagResult;

    /** 治疗方案（详细） */
    private String treatmentPlan;

    /** 1=已隔离，0=未隔离 */
    @Excel(name = "1=已隔离，0=未隔离")
    private Integer isIsolated;

    /** 隔离地点 */
    private String isolateAddress;

    /** 隔离开始日期 */
    private Date isolateStart;

    /** 隔离结束日期 */
    private Date isolateEnd;

    /** 用药情况（如：连花清瘟胶囊，每日3次） */
    private String medication;

    /** 检查项目（如：核酸检测/胸部CT） */
    private String checkItems;

    /** 检查结果（如：核酸阳性/CT显示肺部炎症） */
    private String checkResult;

    /** 1=治疗中，2=已治愈，3=转院，4=死亡 */
    private Integer cureStatus;

    /** 治愈/出院时间 */
    private Date cureDatetime;

    public void setDiagId(Long diagId) 
    {
        this.diagId = diagId;
    }

    public Long getDiagId() 
    {
        return diagId;
    }

    public void setCaseId(Long caseId) 
    {
        this.caseId = caseId;
    }

    public Long getCaseId() 
    {
        return caseId;
    }

    public void setDiagDoctor(String diagDoctor) 
    {
        this.diagDoctor = diagDoctor;
    }

    public String getDiagDoctor() 
    {
        return diagDoctor;
    }

    public void setDiagDatetime(Date diagDatetime) 
    {
        this.diagDatetime = diagDatetime;
    }

    public Date getDiagDatetime() 
    {
        return diagDatetime;
    }

    public void setDiagResult(String diagResult) 
    {
        this.diagResult = diagResult;
    }

    public String getDiagResult() 
    {
        return diagResult;
    }

    public void setTreatmentPlan(String treatmentPlan) 
    {
        this.treatmentPlan = treatmentPlan;
    }

    public String getTreatmentPlan() 
    {
        return treatmentPlan;
    }

    public void setIsIsolated(Integer isIsolated) 
    {
        this.isIsolated = isIsolated;
    }

    public Integer getIsIsolated() 
    {
        return isIsolated;
    }

    public void setIsolateAddress(String isolateAddress) 
    {
        this.isolateAddress = isolateAddress;
    }

    public String getIsolateAddress() 
    {
        return isolateAddress;
    }

    public void setIsolateStart(Date isolateStart) 
    {
        this.isolateStart = isolateStart;
    }

    public Date getIsolateStart() 
    {
        return isolateStart;
    }

    public void setIsolateEnd(Date isolateEnd) 
    {
        this.isolateEnd = isolateEnd;
    }

    public Date getIsolateEnd() 
    {
        return isolateEnd;
    }

    public void setMedication(String medication) 
    {
        this.medication = medication;
    }

    public String getMedication() 
    {
        return medication;
    }

    public void setCheckItems(String checkItems) 
    {
        this.checkItems = checkItems;
    }

    public String getCheckItems() 
    {
        return checkItems;
    }

    public void setCheckResult(String checkResult) 
    {
        this.checkResult = checkResult;
    }

    public String getCheckResult() 
    {
        return checkResult;
    }

    public void setCureStatus(Integer cureStatus) 
    {
        this.cureStatus = cureStatus;
    }

    public Integer getCureStatus() 
    {
        return cureStatus;
    }

    public void setCureDatetime(Date cureDatetime) 
    {
        this.cureDatetime = cureDatetime;
    }

    public Date getCureDatetime() 
    {
        return cureDatetime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("diagId", getDiagId())
            .append("caseId", getCaseId())
            .append("diagDoctor", getDiagDoctor())
            .append("diagDatetime", getDiagDatetime())
            .append("diagResult", getDiagResult())
            .append("treatmentPlan", getTreatmentPlan())
            .append("isIsolated", getIsIsolated())
            .append("isolateAddress", getIsolateAddress())
            .append("isolateStart", getIsolateStart())
            .append("isolateEnd", getIsolateEnd())
            .append("medication", getMedication())
            .append("checkItems", getCheckItems())
            .append("checkResult", getCheckResult())
            .append("cureStatus", getCureStatus())
            .append("cureDatetime", getCureDatetime())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
