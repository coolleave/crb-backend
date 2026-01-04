package com.coolleave.report.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.coolleave.report.mapper.HealthDeptMapper;
import com.coolleave.report.domain.HealthDept;
import com.coolleave.report.service.IHealthDeptService;

/**
 * 卫生机构/部门信息Service业务层处理
 * 
 * @author coolleave
 * @date 2026-01-04
 */
@Service
public class HealthDeptServiceImpl implements IHealthDeptService 
{
    @Autowired
    private HealthDeptMapper healthDeptMapper;

    /**
     * 查询卫生机构/部门信息
     * 
     * @param deptId 卫生机构/部门信息主键
     * @return 卫生机构/部门信息
     */
    @Override
    public HealthDept selectHealthDeptByDeptId(Long deptId)
    {
        return healthDeptMapper.selectHealthDeptByDeptId(deptId);
    }

    /**
     * 查询卫生机构/部门信息列表
     * 
     * @param healthDept 卫生机构/部门信息
     * @return 卫生机构/部门信息
     */
    @Override
    public List<HealthDept> selectHealthDeptList(HealthDept healthDept)
    {
        return healthDeptMapper.selectHealthDeptList(healthDept);
    }

    /**
     * 新增卫生机构/部门信息
     * 
     * @param healthDept 卫生机构/部门信息
     * @return 结果
     */
    @Override
    public int insertHealthDept(HealthDept healthDept)
    {
        return healthDeptMapper.insertHealthDept(healthDept);
    }

    /**
     * 修改卫生机构/部门信息
     * 
     * @param healthDept 卫生机构/部门信息
     * @return 结果
     */
    @Override
    public int updateHealthDept(HealthDept healthDept)
    {
        return healthDeptMapper.updateHealthDept(healthDept);
    }

    /**
     * 批量删除卫生机构/部门信息
     * 
     * @param deptIds 需要删除的卫生机构/部门信息主键
     * @return 结果
     */
    @Override
    public int deleteHealthDeptByDeptIds(Long[] deptIds)
    {
        return healthDeptMapper.deleteHealthDeptByDeptIds(deptIds);
    }

    /**
     * 删除卫生机构/部门信息信息
     * 
     * @param deptId 卫生机构/部门信息主键
     * @return 结果
     */
    @Override
    public int deleteHealthDeptByDeptId(Long deptId)
    {
        return healthDeptMapper.deleteHealthDeptByDeptId(deptId);
    }
}
