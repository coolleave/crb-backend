package com.coolleave.report.domain;

import java.util.Date;

import com.coolleave.common.core.domain.BaseEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.coolleave.common.annotation.Excel;
/**
 * 上报数据核实诊断与调查处理对象 case_verify_investigate
 * 
 * @author coolleave
 * @date 2026-01-01
 */
public class CaseVerifyInvestigate extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 核实ID */
    private Long verifyId;

    /** 关联病例ID */
    @Excel(name = "关联病例ID")
    private Long caseId;

    /** 核实疾控人员ID */
    private Long verifyStaffId;

    /** 核实时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "核实时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date verifyDatetime;

    /** 1=确诊，2=疑似，3=排除，4=待复查 */
    @Excel(name = "1=确诊，2=疑似，3=排除，4=待复查")
    private Integer verifyResult;

    /** 核实依据（如：核酸检测阳性+临床症状符合） */
    @Excel(name = "核实依据", readConverterExp = "如=：核酸检测阳性+临床症状符合")
    private String verifyBasis;

    /** 流行病学调查时间 */
    private Date surveyDatetime;

    /** 流行病学调查内容（详细） */
    private String surveyContent;

    /** 参与调查人员（如：张三、李四） */
    private String surveyStaff;

    /** 处理措施（如：密接集中隔离+环境消杀） */
    private String handleMeasure;

    /** 1=未处理，2=处理中，3=已完成，4=无需处理 */
    @Excel(name = "1=未处理，2=处理中，3=已完成，4=无需处理")
    private Integer handleStatus;

    /** 处理完成时间 */
    private Date handleDatetime;

    /** 处理结果（如：密接20人已隔离） */
    private String handleResult;

    public void setVerifyId(Long verifyId) 
    {
        this.verifyId = verifyId;
    }

    public Long getVerifyId() 
    {
        return verifyId;
    }

    public void setCaseId(Long caseId) 
    {
        this.caseId = caseId;
    }

    public Long getCaseId() 
    {
        return caseId;
    }

    public void setVerifyStaffId(Long verifyStaffId) 
    {
        this.verifyStaffId = verifyStaffId;
    }

    public Long getVerifyStaffId() 
    {
        return verifyStaffId;
    }

    public void setVerifyDatetime(Date verifyDatetime) 
    {
        this.verifyDatetime = verifyDatetime;
    }

    public Date getVerifyDatetime() 
    {
        return verifyDatetime;
    }

    public void setVerifyResult(Integer verifyResult) 
    {
        this.verifyResult = verifyResult;
    }

    public Integer getVerifyResult() 
    {
        return verifyResult;
    }

    public void setVerifyBasis(String verifyBasis) 
    {
        this.verifyBasis = verifyBasis;
    }

    public String getVerifyBasis() 
    {
        return verifyBasis;
    }

    public void setSurveyDatetime(Date surveyDatetime) 
    {
        this.surveyDatetime = surveyDatetime;
    }

    public Date getSurveyDatetime() 
    {
        return surveyDatetime;
    }

    public void setSurveyContent(String surveyContent) 
    {
        this.surveyContent = surveyContent;
    }

    public String getSurveyContent() 
    {
        return surveyContent;
    }

    public void setSurveyStaff(String surveyStaff) 
    {
        this.surveyStaff = surveyStaff;
    }

    public String getSurveyStaff() 
    {
        return surveyStaff;
    }

    public void setHandleMeasure(String handleMeasure) 
    {
        this.handleMeasure = handleMeasure;
    }

    public String getHandleMeasure() 
    {
        return handleMeasure;
    }

    public void setHandleStatus(Integer handleStatus) 
    {
        this.handleStatus = handleStatus;
    }

    public Integer getHandleStatus() 
    {
        return handleStatus;
    }

    public void setHandleDatetime(Date handleDatetime) 
    {
        this.handleDatetime = handleDatetime;
    }

    public Date getHandleDatetime() 
    {
        return handleDatetime;
    }

    public void setHandleResult(String handleResult) 
    {
        this.handleResult = handleResult;
    }

    public String getHandleResult() 
    {
        return handleResult;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("verifyId", getVerifyId())
            .append("caseId", getCaseId())
            .append("verifyStaffId", getVerifyStaffId())
            .append("verifyDatetime", getVerifyDatetime())
            .append("verifyResult", getVerifyResult())
            .append("verifyBasis", getVerifyBasis())
            .append("surveyDatetime", getSurveyDatetime())
            .append("surveyContent", getSurveyContent())
            .append("surveyStaff", getSurveyStaff())
            .append("handleMeasure", getHandleMeasure())
            .append("handleStatus", getHandleStatus())
            .append("handleDatetime", getHandleDatetime())
            .append("handleResult", getHandleResult())
            .append("remark", getRemark())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
