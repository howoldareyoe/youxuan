package com.yu.youxuan.order.controller;



import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yu.youxuan.common.auth.AuthContextHolder;
import com.yu.youxuan.common.result.Result;
import com.yu.youxuan.common.result.ResultCodeEnum;
import com.yu.youxuan.model.order.OrderInfo;
import com.yu.youxuan.order.service.OrderInfoService;
import com.yu.youxuan.vo.order.OrderConfirmVo;
import com.yu.youxuan.vo.order.OrderSubmitVo;
import com.yu.youxuan.vo.order.OrderUserQueryVo;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;


@RestController
@RequestMapping(value="/api/order")
public class OrderInfoController {

    @Autowired
    private OrderInfoService orderInfoService;

    //订单查询
    @GetMapping("auth/findUserOrderPage/{page}/{limit}")
    public Result findUserOrderPage(
            @ApiParam(name = "page", value = "当前页码", required = true)
            @PathVariable Long page,
            @ApiParam(name = "limit", value = "每页记录数", required = true)
            @PathVariable Long limit,
            @ApiParam(name = "orderVo", value = "查询对象", required = false)
                    OrderUserQueryVo orderUserQueryVo) {
        //获取userId
        Long userId = AuthContextHolder.getUserId();
        orderUserQueryVo.setUserId(userId);

        //分页查询条件
        Page<OrderInfo> pageParam = new Page<>(page,limit);
        IPage<OrderInfo> pageModel = orderInfoService.getOrderInfoByUserIdPage(pageParam,orderUserQueryVo);
        return Result.ok(pageModel);
    }

    @ApiOperation(value = "查询支付状态")
    @GetMapping("/queryPayStatus/{orderNo}")
    public Result queryPayStatus(
            @ApiParam(name = "orderNo", value = "订单No", required = true)
            @PathVariable("orderNo") String orderNo) {
        System.out.println(new Date().toLocaleString());
        for (int i = 0; i <=3; i++) {
            if(i==3) {
                return Result.ok(ResultCodeEnum.SUCCESS);
            }
        }
        return Result.ok(ResultCodeEnum.URL_ENCODE_ERROR);
    }

    @ApiOperation("确认订单")
    @GetMapping("auth/confirmOrder")
    public Result confirm() {
        OrderConfirmVo orderConfirmVo = orderInfoService.confirmOrder();
        return Result.ok(orderConfirmVo);
    }

    @ApiOperation("生成订单")
    @PostMapping("auth/submitOrder")
    public Result submitOrder(@RequestBody OrderSubmitVo orderParamVo) {
        Long orderId = orderInfoService.submitOrder(orderParamVo);
        return Result.ok(orderId);
    }

    @ApiOperation("获取订单详情")
    @GetMapping("auth/getOrderInfoById/{orderId}")
    public Result getOrderInfoById(@PathVariable("orderId") Long orderId){
        OrderInfo orderInfo = orderInfoService.getOrderInfoById(orderId);
        return Result.ok(orderInfo);
    }

    //根据orderNo查询订单信息
    @GetMapping("inner/getOrderInfo/{orderNo}")
    public OrderInfo getOrderInfo(@PathVariable("orderNo") String orderNo) {
        OrderInfo orderInfo = orderInfoService.getOrderInfoByOrderNo(orderNo);
        return orderInfo;
    }
}

