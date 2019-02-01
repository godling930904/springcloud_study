package com.godling.product.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created with 凌神.
 * Description:
 * User: 87179
 * Date: 2019-01-17
 * Time: 23:20
 */
@Getter
@AllArgsConstructor
public enum ResultEnum {
    /**
     * 商品不存在的枚举
     */
    PRODUCT_NOT_EXIST(1, "商品不存在"),

    /**
     * 库存不足的枚举
     */
    PRODUCT_STOCK_ERROR(2, "库存不足!"),
    ;

    private Integer code;

    private String message;

}
