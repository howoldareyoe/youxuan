package com.yu.youxuan.acl.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yu.youxuan.acl.mapper.AdminRoleMapper;
import com.yu.youxuan.acl.service.AdminRoleService;
import com.yu.youxuan.model.acl.AdminRole;
import org.springframework.stereotype.Service;

@Service
public class AdminRoleServiceImpl extends ServiceImpl<AdminRoleMapper, AdminRole> implements AdminRoleService {
}
