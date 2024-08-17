package com.yu.youxuan.sys.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yu.youxuan.model.sys.Region;
import com.yu.youxuan.sys.mapper.RegionMapper;
import com.yu.youxuan.sys.service.RegionService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RegionServiceImpl extends ServiceImpl<RegionMapper, Region> implements RegionService {

    //根据区域关键字查询区域列表信息
    @Override
    public List<Region> getRegionByKeyword(String keyword) {
        LambdaQueryWrapper<Region> wrapper = new LambdaQueryWrapper<>();
        wrapper.like(Region::getName,keyword);
        List<Region> list = baseMapper.selectList(wrapper);
        return list;
    }
}
