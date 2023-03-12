package com.github.w4o.xx.manage.param;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * 修改密码请求参数
 *
 * @author Frank
 */
@Data
@Schema(name = "修改密码参数")
public class ChangePasswordParam {
    @NotBlank
    @Schema(title = "旧密码")
    private String oldPassword;
    @NotBlank
    @Schema(title = "新密码")
    private String newPassword;
}
