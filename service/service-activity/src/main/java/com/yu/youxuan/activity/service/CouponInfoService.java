package com.yu.youxuan.activity.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yu.youxuan.model.activity.CouponInfo;
import com.yu.youxuan.model.order.CartInfo;
import com.yu.youxuan.vo.activity.CouponRuleVo;

import java.util.List;
import java.util.Map;


public interface CouponInfoService extends IService<CouponInfo> {

    //1 优惠卷分页查询
    IPage<CouponInfo> selectPageCouponInfo(Long page, Long limit);

    //3 根据id查询优惠卷
    CouponInfo getCouponInfo(Long id);

    //4 根据优惠卷id查询规则数据
    Map<String, Object> findCouponRuleList(Long id);

    //5 添加优惠卷规则数据
    void saveCouponRule(CouponRuleVo couponRuleVo);

    //2 根据skuId+userId查询优惠卷信息
    List<CouponInfo> findCouponInfoList(Long skuId, Long userId);

    //3 获取购物车可以使用优惠卷列表
    List<CouponInfo> findCartCouponInfo(List<CartInfo> cartInfoList, Long userId);

    //获取购物车对应优惠卷
    CouponInfo findRangeSkuIdList(List<CartInfo> cartInfoList, Long couponId);

    //更新优惠卷使用状态
    void updateCouponInfoUseStatus(Long couponId, Long userId, Long orderId);
}
