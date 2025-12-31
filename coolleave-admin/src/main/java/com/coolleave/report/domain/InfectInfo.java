package com.coolleave.report.domain;

import com.coolleave.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.coolleave.common.annotation.Excel;

/**
 * 传染病信息字典对象 infect_info
 * 
 * @author coolleave
 * @date 2025-12-31
 */
public class InfectInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 传染病ID */
    private Long infectId;

    /** 传染病编码（6位） */
    @Excel(name = "传染病编码", readConverterExp = "6=位")
    private String infectCode;

    /** 传染病名称 */
    @Excel(name = "传染病名称")
    private String infectName;

    /** 1=甲类，2=乙类，3=丙类 */
    private Integer infectLevel;

    public void setInfectId(Long infectId) 
    {
        this.infectId = infectId;
    }

    public Long getInfectId() 
    {
        return infectId;
    }

    public void setInfectCode(String infectCode) 
    {
        this.infectCode = infectCode;
    }

    public String getInfectCode() 
    {
        return infectCode;
    }

    public void setInfectName(String infectName) 
    {
        this.infectName = infectName;
    }

    public String getInfectName() 
    {
        return infectName;
    }

    public void setInfectLevel(Integer infectLevel) 
    {
        this.infectLevel = infectLevel;
    }

    public Integer getInfectLevel() 
    {
        return infectLevel;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("infectId", getInfectId())
            .append("infectCode", getInfectCode())
            .append("infectName", getInfectName())
            .append("infectLevel", getInfectLevel())
            .toString();
    }
}
