package com.yu.youxuan.product.controller;



import com.yu.youxuan.common.result.Result;
import com.yu.youxuan.model.product.Attr;
import com.yu.youxuan.product.service.AttrService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/admin/product/attr")
//@CrossOrigin
public class AttrController {

    @Autowired
    private AttrService attrService;

    //平台属性列表方法
    //根据平台属性分组id查询
//    url: `${api_name}/${groupId}`,
//    method: 'get'
    @ApiOperation("根据平台属性分组id查询")
    @GetMapping("{groupId}")
    public Result list(@PathVariable Long groupId) {
        List<Attr> list = attrService.getAttrListByGroupId(groupId);
        return Result.ok(list);
    }

    @ApiOperation(value = "获取")
    @GetMapping("get/{id}")
    public Result get(@PathVariable Long id) {
        Attr attr = attrService.getById(id);
        return Result.ok(attr);
    }

    @ApiOperation(value = "新增")
    @PostMapping("save")
    public Result save(@RequestBody Attr attr) {
        attrService.save(attr);
        return Result.ok(null);
    }

    @ApiOperation(value = "修改")
    @PutMapping("update")
    public Result updateById(@RequestBody Attr attr) {
        attrService.updateById(attr);
        return Result.ok(null);
    }

    @ApiOperation(value = "删除")
    @DeleteMapping("remove/{id}")
    public Result remove(@PathVariable Long id) {
        attrService.removeById(id);
        return Result.ok(null);
    }

    @ApiOperation(value = "根据id列表删除")
    @DeleteMapping("batchRemove")
    public Result batchRemove(@RequestBody List<Long> idList) {
        attrService.removeByIds(idList);
        return Result.ok(null);
    }
}

