package com.yu.youxuan.model.acl;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.yu.youxuan.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 * 用户角色
 * </p>
 *
 * @author qy
 * @since 2019-11-08
 */
@Data
@ApiModel(description = "用户角色")
@TableName("admin_role")
public class AdminRole extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value = "角色id")
	@TableField("role_id")
	private Long roleId;

	@ApiModelProperty(value = "用户id")
	@TableField("admin_id")
	private Long adminId;

}

