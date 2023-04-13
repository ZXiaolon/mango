package com.xiaolon.mango.admin.service;

import java.util.List;

import com.xiaolon.mango.admin.model.SysUser;

public interface SysUserService {

    /**
     * 查找所有用户
     * @return
     */
    List<SysUser> findAll();

}