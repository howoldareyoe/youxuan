package com.yu.youxuan.model.product;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.yu.youxuan.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "AttrGroup")
@TableName("attr_group")
public class AttrGroup extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "组名")
	@TableField("name")
	private String name;

	@ApiModelProperty(value = "排序")
	@TableField("sort")
	private Integer sort;

	@ApiModelProperty(value = "备注")
	@TableField("remark")
	private String remark;

}