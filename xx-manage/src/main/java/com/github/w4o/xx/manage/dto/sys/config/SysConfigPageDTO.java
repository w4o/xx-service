package com.github.w4o.xx.manage.dto.sys.config;

import com.github.w4o.xx.core.base.dto.BasePageDataDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Frank
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Schema(name = "系统配置分页数据模型")
public class SysConfigPageDTO extends BasePageDataDTO {
    @Schema(description = "配置ID")
    private Long configId;
    @Schema(description = "配置key")
    private String configKey;
    @Schema(description = "配置值")
    private String configValue;
    @Schema(description = "配置备注信息")
    private String remark;
}
