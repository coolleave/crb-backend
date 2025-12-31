package com.coolleave.report.service;

import java.util.List;
import com.coolleave.report.domain.InfectInfo;

/**
 * 传染病信息字典Service接口
 * 
 * @author coolleave
 * @date 2025-12-31
 */
public interface IInfectInfoService 
{
    /**
     * 查询传染病信息字典
     * 
     * @param infectId 传染病信息字典主键
     * @return 传染病信息字典
     */
    public InfectInfo selectInfectInfoByInfectId(Long infectId);

    /**
     * 查询传染病信息字典列表
     * 
     * @param infectInfo 传染病信息字典
     * @return 传染病信息字典集合
     */
    public List<InfectInfo> selectInfectInfoList(InfectInfo infectInfo);

    /**
     * 新增传染病信息字典
     * 
     * @param infectInfo 传染病信息字典
     * @return 结果
     */
    public int insertInfectInfo(InfectInfo infectInfo);

    /**
     * 修改传染病信息字典
     * 
     * @param infectInfo 传染病信息字典
     * @return 结果
     */
    public int updateInfectInfo(InfectInfo infectInfo);

    /**
     * 批量删除传染病信息字典
     * 
     * @param infectIds 需要删除的传染病信息字典主键集合
     * @return 结果
     */
    public int deleteInfectInfoByInfectIds(Long[] infectIds);

    /**
     * 删除传染病信息字典信息
     * 
     * @param infectId 传染病信息字典主键
     * @return 结果
     */
    public int deleteInfectInfoByInfectId(Long infectId);
}
