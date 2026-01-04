package com.coolleave.report.domain;

import com.coolleave.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.coolleave.common.annotation.Excel;

/**
 * 卫生机构/部门信息对象 health_dept
 * 
 * @author coolleave
 * @date 2026-01-04
 */
public class HealthDept extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 机构ID */
    private Long deptId;

    /** 机构名称 */
    @Excel(name = "机构名称")
    private String deptName;

    /** 机构级别 */
    @Excel(name = "机构级别")
    private Integer deptLevel;

    /** 省份 */
    @Excel(name = "省份")
    private String province;

    /** 城市 */
    @Excel(name = "城市")
    private String city;

    /** 区县 */
    @Excel(name = "区县")
    private String district;

    public void setDeptId(Long deptId) 
    {
        this.deptId = deptId;
    }

    public Long getDeptId() 
    {
        return deptId;
    }

    public void setDeptName(String deptName) 
    {
        this.deptName = deptName;
    }

    public String getDeptName() 
    {
        return deptName;
    }

    public void setDeptLevel(Integer deptLevel) 
    {
        this.deptLevel = deptLevel;
    }

    public Integer getDeptLevel() 
    {
        return deptLevel;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("deptId", getDeptId())
            .append("deptName", getDeptName())
            .append("deptLevel", getDeptLevel())
            .append("province", getProvince())
            .append("city", getCity())
            .append("district", getDistrict())
            .toString();
    }
}
