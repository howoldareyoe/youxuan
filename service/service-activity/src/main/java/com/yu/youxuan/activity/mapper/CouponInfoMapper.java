package com.yu.youxuan.activity.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yu.youxuan.model.activity.CouponInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


public interface CouponInfoMapper extends BaseMapper<CouponInfo> {

    //2 根据skuId+userId查询优惠卷信息
    List<CouponInfo> selectCouponInfoList(@Param("skuId") Long id,
                                          @Param("categoryId") Long categoryId,
                                          @Param("userId") Long userId);

    //1 根据userId获取用户全部优惠卷
    List<CouponInfo> selectCartCouponInfoList(@Param("userId") Long userId);
}
