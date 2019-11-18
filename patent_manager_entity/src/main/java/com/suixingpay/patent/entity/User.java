package com.suixingpay.patent.entity;

import lombok.Data;

/**
 * @description:
 * @author: Adminstrator
 * @date: 2019-11-18 17:43
 * @version: V1.0
 */
@Data
public class User {
    /** 用户名 **/
    private Long userId;
    /** 真实姓名 **/
    private String userName;
    /** 密码 **/
    private String userPassword;
    /** 编号 **/
    private String userStaff;
    /** 电话 **/
    private String userPhone;
    /** 邮箱 **/
    private String userEmail;
    /** 性别 **/
    private String userSex;
    /** 状态 **/
    private Integer userState;
    /** 角色 **/
    private Integer userRole;
    /** 部门 **/
    private Integer userDepartment;
}
