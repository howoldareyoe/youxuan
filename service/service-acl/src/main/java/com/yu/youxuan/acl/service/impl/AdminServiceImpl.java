package com.yu.youxuan.acl.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yu.youxuan.acl.mapper.AdminMapper;
import com.yu.youxuan.acl.service.AdminService;
import com.yu.youxuan.model.acl.Admin;
import com.yu.youxuan.vo.acl.AdminQueryVo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {
    //1 用户列表
    @Override
    public IPage<Admin> selectPageUser(Page<Admin> pageParam, AdminQueryVo adminQueryVo) {
        String username = adminQueryVo.getUsername();
        String name = adminQueryVo.getName();
        LambdaQueryWrapper<Admin> wrapper = new LambdaQueryWrapper<>();
        if(!StringUtils.isEmpty(username)) {
            wrapper.eq(Admin::getUsername,username);
        }
        if(!StringUtils.isEmpty(name)) {
            wrapper.like(Admin::getName,name);
        }
        IPage<Admin> adminPage = baseMapper.selectPage(pageParam, wrapper);
        return adminPage;
    }
}
