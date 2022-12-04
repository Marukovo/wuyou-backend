package com.example.wuyou.model.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

/**
 * 用户信息;
 * @author : One Direction
 * @date : 2022-11-22
 */
@ApiModel(value = "用户模型",description = "")
@Data
public class User implements Serializable,Cloneable{
    @ApiModelProperty(name = "主键",notes = "")
    private String  id ;
    /** 用户名 */
    @ApiModelProperty(name = "用户名",notes = "")
    private String username ;
    /** 密码 */
    @ApiModelProperty(name = "密码",notes = "")
    private String password ;
    /** 手机号码 */
    @ApiModelProperty(name = "手机号码",notes = "")
    private String mobile ;
    /** 头像地址 */
    @ApiModelProperty(name = "头像地址",notes = "")
    private String avatar ;
    /** 用户角色 */
    @ApiModelProperty(name = "用户角色",notes = "")
    private Integer role ;
    /** 公司id */
    @ApiModelProperty(name = "公司id",notes = "")
    private String companyId ;
    /** 账号状态 */
    @ApiModelProperty(name = "账号状态",notes = "")
    private Boolean enableStatus ;
    /** 认证id */
    @ApiModelProperty(name = "认证id",notes = "")
    private String authId ;
    /** 注册时间 */
    @ApiModelProperty(name = "注册时间",notes = "")
    private Double registerDate ;
}
