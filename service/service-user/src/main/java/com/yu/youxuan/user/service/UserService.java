package com.yu.youxuan.user.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.yu.youxuan.enums.user.User;
import com.yu.youxuan.vo.user.LeaderAddressVo;
import com.yu.youxuan.vo.user.UserLoginVo;

public interface UserService extends IService<User> {
    //// 判断是否是第一次使用微信授权登录：如何判断？openId
    User getUserByOpenId(String openid);

    //5 根据userId查询提货点和团长信息
    LeaderAddressVo getLeaderAddressByUserId(Long userId);

    //7 获取当前登录用户信息，
    UserLoginVo getUserLoginVo(Long id);
}
