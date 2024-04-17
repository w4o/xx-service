package com.github.w4o.xx.applet.controller.mall;

import com.github.w4o.xx.core.base.CommonResult;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Frank
 */
@Slf4j
@Validated
@RestController
@RequestMapping("/mall/goodsCategory")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Tag(name = "23. 商品分类接口")
public class GoodsCategoryController {

    @Operation(summary = "分类列表")
    @GetMapping
    public CommonResult<?> list() {
        return CommonResult.success();
    }
}