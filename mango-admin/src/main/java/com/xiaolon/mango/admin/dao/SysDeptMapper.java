package com.xiaolon.mango.admin.dao;

import com.xiaolon.mango.admin.model.SysDept;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysDeptMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysDept record);

    int insertSelective(SysDept record);

    SysDept selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysDept record);

    int updateByPrimaryKey(SysDept record);
}