package com.yu.youxuan.sys.controller;



import com.yu.youxuan.common.result.Result;
import com.yu.youxuan.model.sys.Region;
import com.yu.youxuan.sys.service.RegionService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/admin/sys/region")
//@CrossOrigin
public class RegionController {

    @Autowired
    private RegionService regionService;

    //根据区域关键字查询区域列表信息
//    url: `${api_name}/findRegionByKeyword/${keyword}`,
//    method: 'get'
    @ApiOperation("根据区域关键字查询区域列表信息")
    @GetMapping("findRegionByKeyword/{keyword}")
    public Result findRegionByKeyword(@PathVariable("keyword") String keyword) {
        List<Region> list = regionService.getRegionByKeyword(keyword);
        return Result.ok(list);
    }
}

