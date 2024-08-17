package com.yu.youxuan.sys.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yu.youxuan.model.sys.Ware;
import com.yu.youxuan.sys.mapper.WareMapper;
import com.yu.youxuan.sys.service.WareService;
import org.springframework.stereotype.Service;


@Service
public class WareServiceImpl extends ServiceImpl<WareMapper, Ware> implements WareService {

}
