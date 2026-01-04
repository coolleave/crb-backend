package com.coolleave.report.mapper;

import java.util.List;
import com.coolleave.report.domain.HealthDept;

/**
 * 卫生机构/部门信息Mapper接口
 * 
 * @author coolleave
 * @date 2026-01-04
 */
public interface HealthDeptMapper 
{
    /**
     * 查询卫生机构/部门信息
     * 
     * @param deptId 卫生机构/部门信息主键
     * @return 卫生机构/部门信息
     */
    public HealthDept selectHealthDeptByDeptId(Long deptId);

    /**
     * 查询卫生机构/部门信息列表
     * 
     * @param healthDept 卫生机构/部门信息
     * @return 卫生机构/部门信息集合
     */
    public List<HealthDept> selectHealthDeptList(HealthDept healthDept);

    /**
     * 新增卫生机构/部门信息
     * 
     * @param healthDept 卫生机构/部门信息
     * @return 结果
     */
    public int insertHealthDept(HealthDept healthDept);

    /**
     * 修改卫生机构/部门信息
     * 
     * @param healthDept 卫生机构/部门信息
     * @return 结果
     */
    public int updateHealthDept(HealthDept healthDept);

    /**
     * 删除卫生机构/部门信息
     * 
     * @param deptId 卫生机构/部门信息主键
     * @return 结果
     */
    public int deleteHealthDeptByDeptId(Long deptId);

    /**
     * 批量删除卫生机构/部门信息
     * 
     * @param deptIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteHealthDeptByDeptIds(Long[] deptIds);
}
