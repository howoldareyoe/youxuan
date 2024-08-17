package com.yu.youxuan.mq.constant;

public class MqConst {
    /**
     * 消息补偿
     */
    public static final String MQ_KEY_PREFIX = "youxuan.mq:list";
    public static final int RETRY_COUNT = 3;

    /**
     * 商品上下架
     */
    public static final String EXCHANGE_GOODS_DIRECT = "youxuan.goods.direct";
    public static final String ROUTING_GOODS_UPPER = "youxuan.goods.upper";
    public static final String ROUTING_GOODS_LOWER = "youxuan.goods.lower";
    //队列
    public static final String QUEUE_GOODS_UPPER  = "youxuan.goods.upper";
    public static final String QUEUE_GOODS_LOWER  = "youxuan.goods.lower";

    /**
     * 团长上下线
     */
    public static final String EXCHANGE_LEADER_DIRECT = "youxuan.leader.direct";
    public static final String ROUTING_LEADER_UPPER = "youxuan.leader.upper";
    public static final String ROUTING_LEADER_LOWER = "youxuan.leader.lower";
    //队列
    public static final String QUEUE_LEADER_UPPER  = "youxuan.leader.upper";
    public static final String QUEUE_LEADER_LOWER  = "youxuan.leader.lower";

    //订单
    public static final String EXCHANGE_ORDER_DIRECT = "youxuan.order.direct";
    public static final String ROUTING_ROLLBACK_STOCK = "youxuan.rollback.stock";
    public static final String ROUTING_MINUS_STOCK = "youxuan.minus.stock";

    public static final String ROUTING_DELETE_CART = "youxuan.delete.cart";
    //解锁普通商品库存
    public static final String QUEUE_ROLLBACK_STOCK = "youxuan.rollback.stock";
    public static final String QUEUE_SECKILL_ROLLBACK_STOCK = "youxuan.seckill.rollback.stock";
    public static final String QUEUE_MINUS_STOCK = "youxuan.minus.stock";
    public static final String QUEUE_DELETE_CART = "youxuan.delete.cart";

    //支付
    public static final String EXCHANGE_PAY_DIRECT = "youxuan.pay.direct";
    public static final String ROUTING_PAY_SUCCESS = "youxuan.pay.success";
    public static final String QUEUE_ORDER_PAY  = "youxuan.order.pay";
    public static final String QUEUE_LEADER_BILL  = "youxuan.leader.bill";

    //取消订单
    public static final String EXCHANGE_CANCEL_ORDER_DIRECT = "youxuan.cancel.order.direct";
    public static final String ROUTING_CANCEL_ORDER = "youxuan.cancel.order";
    //延迟取消订单队列
    public static final String QUEUE_CANCEL_ORDER  = "youxuan.cancel.order";

    /**
     * 定时任务
     */
    public static final String EXCHANGE_DIRECT_TASK = "youxuan.exchange.direct.task";
    public static final String ROUTING_TASK_23 = "youxuan.task.23";
    //队列
    public static final String QUEUE_TASK_23  = "youxuan.queue.task.23";
}