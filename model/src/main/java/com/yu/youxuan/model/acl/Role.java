//
//
package com.yu.youxuan.model.acl;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.yu.youxuan.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 * 角色
 * </p>
 *
 * @author qy
 * @since 2019-11-08
 */
@Data
@ApiModel(description = "角色")
@TableName("role")
public class Role extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value = "角色名称")
	@TableField("role_name")
	private String roleName;

	@ApiModelProperty(value = "备注")
	@TableField("remark")
	private String remark;

}

