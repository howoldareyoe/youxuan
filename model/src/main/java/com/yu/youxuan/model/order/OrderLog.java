package com.yu.youxuan.model.order;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.yu.youxuan.enums.ProcessStatus;
import com.yu.youxuan.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "OrderLog")
@TableName("order_log")
public class OrderLog extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "订单id")
	@TableField("order_id")
	private Long orderId;

	@ApiModelProperty(value = "操作人：用户；系统；后台管理员")
	@TableField("operate_user")
	private String operateUser;

	@ApiModelProperty(value = "操作状态")
	@TableField("process_status")
	private ProcessStatus processStatus;

	@ApiModelProperty(value = "备注")
	@TableField("note")
	private String note;

}