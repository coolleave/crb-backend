package com.coolleave.report.domain;

import java.util.Date;

import com.coolleave.common.core.domain.BaseEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.coolleave.common.annotation.Excel;

/**
 * 病例轨迹与接触人群对象 case_track_contact
 * 
 * @author coolleave
 * @date 2026-01-01
 */
public class CaseTrackContact extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long trackId;

    /** 关联病例ID */
    @Excel(name = "关联病例ID")
    private Long caseId;

    /** 轨迹发生时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "轨迹发生时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date trackDatetime;

    /** 轨迹地点（如：XX商场3楼） */
    @Excel(name = "轨迹地点", readConverterExp = "如=：XX商场3楼")
    private String trackAddress;

    /** 轨迹类型 */
    @Excel(name = "轨迹类型")
    private Long trackType;

    /** 轨迹描述（如：乘坐地铁2号线，XX站-XX站） */
    @Excel(name = "轨迹描述", readConverterExp = "如=：乘坐地铁2号线，XX站-XX站")
    private String trackDesc;

    /** 接触人姓名 */
    @Excel(name = "接触人姓名")
    private String contactName;

    /** 接触关系（家人/同事/陌生人） */
    @Excel(name = "接触关系", readConverterExp = "家=人/同事/陌生人")
    private String contactRelation;

    /** 接触人身份证号 */
    private String contactIdcard;

    /** 接触人手机号 */
    private String contactPhone;

    /** 接触时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "接触时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date contactDatetime;

    /** 接触地点 */
    @Excel(name = "接触地点")
    private String contactAddress;

    /** 1=高风险，2=中风险，3=低风险 */
    private Integer contactRisk;

    public void setTrackId(Long trackId) 
    {
        this.trackId = trackId;
    }

    public Long getTrackId() 
    {
        return trackId;
    }

    public void setCaseId(Long caseId) 
    {
        this.caseId = caseId;
    }

    public Long getCaseId() 
    {
        return caseId;
    }

    public void setTrackDatetime(Date trackDatetime) 
    {
        this.trackDatetime = trackDatetime;
    }

    public Date getTrackDatetime() 
    {
        return trackDatetime;
    }

    public void setTrackAddress(String trackAddress) 
    {
        this.trackAddress = trackAddress;
    }

    public String getTrackAddress() 
    {
        return trackAddress;
    }

    public void setTrackType(Long trackType) 
    {
        this.trackType = trackType;
    }

    public Long getTrackType() 
    {
        return trackType;
    }

    public void setTrackDesc(String trackDesc) 
    {
        this.trackDesc = trackDesc;
    }

    public String getTrackDesc() 
    {
        return trackDesc;
    }

    public void setContactName(String contactName) 
    {
        this.contactName = contactName;
    }

    public String getContactName() 
    {
        return contactName;
    }

    public void setContactRelation(String contactRelation) 
    {
        this.contactRelation = contactRelation;
    }

    public String getContactRelation() 
    {
        return contactRelation;
    }

    public void setContactIdcard(String contactIdcard) 
    {
        this.contactIdcard = contactIdcard;
    }

    public String getContactIdcard() 
    {
        return contactIdcard;
    }

    public void setContactPhone(String contactPhone) 
    {
        this.contactPhone = contactPhone;
    }

    public String getContactPhone() 
    {
        return contactPhone;
    }

    public void setContactDatetime(Date contactDatetime) 
    {
        this.contactDatetime = contactDatetime;
    }

    public Date getContactDatetime() 
    {
        return contactDatetime;
    }

    public void setContactAddress(String contactAddress) 
    {
        this.contactAddress = contactAddress;
    }

    public String getContactAddress() 
    {
        return contactAddress;
    }

    public void setContactRisk(Integer contactRisk) 
    {
        this.contactRisk = contactRisk;
    }

    public Integer getContactRisk() 
    {
        return contactRisk;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("trackId", getTrackId())
            .append("caseId", getCaseId())
            .append("trackDatetime", getTrackDatetime())
            .append("trackAddress", getTrackAddress())
            .append("trackType", getTrackType())
            .append("trackDesc", getTrackDesc())
            .append("contactName", getContactName())
            .append("contactRelation", getContactRelation())
            .append("contactIdcard", getContactIdcard())
            .append("contactPhone", getContactPhone())
            .append("contactDatetime", getContactDatetime())
            .append("contactAddress", getContactAddress())
            .append("contactRisk", getContactRisk())
            .append("createTime", getCreateTime())
            .toString();
    }
}
