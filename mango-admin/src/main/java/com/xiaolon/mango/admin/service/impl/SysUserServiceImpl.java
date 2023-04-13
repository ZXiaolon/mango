package com.xiaolon.mango.admin.service.impl;

import java.util.List;

import com.xiaolon.mango.admin.model.SysUser;
import com.xiaolon.mango.admin.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiaolon.mango.admin.dao.SysUserMapper;

@Service
public class SysUserServiceImpl implements SysUserService {
    
    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> findAll() {
        return sysUserMapper.findAll();
    }
}