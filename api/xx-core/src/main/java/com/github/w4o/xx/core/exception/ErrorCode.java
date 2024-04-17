package com.github.w4o.xx.core.exception;

import com.github.w4o.xx.core.base.CommonError;
import lombok.Getter;

/**
 * 错误信息枚举
 *
 * @author Frank
 */
@Getter
public enum ErrorCode implements CommonError {

    // > 全局错误码 ================================
    E400(400, "请求参数错误"),
    E401(401, "用户没有权限"),
    E404(404, "数据不存在，不能操作"),
    E402(402, "令牌过期"),
    E403(403, "没有权限"),
    E500(500, "服务器发生错误"),

    // > 管理模块错误码 ================================
    E1000(1000, "系统错误"),
    E1001(1001, "数据不存在，不能操作"),
    E1002(1002, "用户名或密码错误"),
    E1003(1003, "验证码错误"),
    E1004(1004, "存在下级部门，不能删除此部门"),
    E1005(1005, "部门下存在用户，不能删除此部门"),
    E1006(1006, "用户名已存在"),
    E1007(1007, "菜单已存在"),
    E1008(1008, "角色名已存在"),
    E1009(1009, "角色下存在用户，不能删除此角色"),
    E1010(1010, "存在下级菜单，不能删除此菜单"),
    E1011(1011, "超级管理员密码不能被重置"),
    E1012(1012, "旧密码不正确，无法修改密码"),
    E1013(1013, "上传文件类型错误"),
    E1014(1014, "字典类型已经存在"),
    E1015(1015, "部门名重复"),
    E1016(1016, "分类已存在"),

    // > 商城模块错误码 ================================
    E1100(1100, "分类名称已存在"),

    // > CMS模块错误码 ================================
    E1200(1200, "标签名称已存在"),
    E1201(1201, "分类名称已存在"),
    E1202(1202, "标签已被使用，无法删除"),
    E1203(1203, "分类已被使用，无法删除"),
    E1204(1204, "文章不存在"),

    // > 小程序管理模块错误码 ================================
    E1300(1300, "配置已存在"),
    E1301(1301, "配置不存在"),
    E1302(1302, "导航不存在"),
    E1303(1303, "文章不存在"),

    // > 小程序模块错误码 ================================
    E2000(2000, "参数错误"),
    E2003(2003, "短信验证码发送频繁，稍后再试"),
    E2004(2004, "短信接口异常，请稍后再试"),
    E2005(2005, "短信验证码错误"),

    // > 客户端模块错误码 ================================
    E3000(3000, ""),

    // > 公共模块错误码 ================================
    E9001(9001, "上传文件类型错误"),
    E9002(9992, "文件上传失败"),
    E9991(9991, "上传文件过大"),
    E9999(9999, "未知错误"),
    ;

    private final int code;
    private final String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
