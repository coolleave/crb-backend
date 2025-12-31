package com.coolleave.report.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.coolleave.report.mapper.InfectInfoMapper;
import com.coolleave.report.domain.InfectInfo;
import com.coolleave.report.service.IInfectInfoService;

/**
 * 传染病信息字典Service业务层处理
 * 
 * @author coolleave
 * @date 2025-12-31
 */
@Service
public class InfectInfoServiceImpl implements IInfectInfoService 
{
    @Autowired
    private InfectInfoMapper infectInfoMapper;

    /**
     * 查询传染病信息字典
     * 
     * @param infectId 传染病信息字典主键
     * @return 传染病信息字典
     */
    @Override
    public InfectInfo selectInfectInfoByInfectId(Long infectId)
    {
        return infectInfoMapper.selectInfectInfoByInfectId(infectId);
    }

    /**
     * 查询传染病信息字典列表
     * 
     * @param infectInfo 传染病信息字典
     * @return 传染病信息字典
     */
    @Override
    public List<InfectInfo> selectInfectInfoList(InfectInfo infectInfo)
    {
        return infectInfoMapper.selectInfectInfoList(infectInfo);
    }

    /**
     * 新增传染病信息字典
     * 
     * @param infectInfo 传染病信息字典
     * @return 结果
     */
    @Override
    public int insertInfectInfo(InfectInfo infectInfo)
    {
        return infectInfoMapper.insertInfectInfo(infectInfo);
    }

    /**
     * 修改传染病信息字典
     * 
     * @param infectInfo 传染病信息字典
     * @return 结果
     */
    @Override
    public int updateInfectInfo(InfectInfo infectInfo)
    {
        return infectInfoMapper.updateInfectInfo(infectInfo);
    }

    /**
     * 批量删除传染病信息字典
     * 
     * @param infectIds 需要删除的传染病信息字典主键
     * @return 结果
     */
    @Override
    public int deleteInfectInfoByInfectIds(Long[] infectIds)
    {
        return infectInfoMapper.deleteInfectInfoByInfectIds(infectIds);
    }

    /**
     * 删除传染病信息字典信息
     * 
     * @param infectId 传染病信息字典主键
     * @return 结果
     */
    @Override
    public int deleteInfectInfoByInfectId(Long infectId)
    {
        return infectInfoMapper.deleteInfectInfoByInfectId(infectId);
    }
}
