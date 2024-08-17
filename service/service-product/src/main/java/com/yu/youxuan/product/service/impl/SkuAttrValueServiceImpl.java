package com.yu.youxuan.product.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yu.youxuan.model.product.SkuAttrValue;
import com.yu.youxuan.product.mapper.SkuAttrValueMapper;
import com.yu.youxuan.product.service.SkuAttrValueService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SkuAttrValueServiceImpl extends ServiceImpl<SkuAttrValueMapper, SkuAttrValue> implements SkuAttrValueService {

    //根据id查询商品属性信息列表
    @Override
    public List<SkuAttrValue> getAttrValueListBySkuId(Long id) {
        LambdaQueryWrapper<SkuAttrValue> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(SkuAttrValue::getSkuId,id);
        return baseMapper.selectList(wrapper);
    }
}
