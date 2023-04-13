package com.xiaolon.mango.admin.dao;

import com.xiaolon.mango.admin.model.SysDict;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysDictMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysDict record);

    int insertSelective(SysDict record);

    SysDict selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysDict record);

    int updateByPrimaryKey(SysDict record);
}