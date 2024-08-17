package com.yu.youxuan.product.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.yu.youxuan.model.product.SkuPoster;

import java.util.List;


public interface SkuPosterService extends IService<SkuPoster> {

    //根据id查询商品海报列表
    List<SkuPoster> getPosterListBySkuId(Long id);
}
