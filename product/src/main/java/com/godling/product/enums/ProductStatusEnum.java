package com.godling.product.enums;

import lombok.Getter;

/**
 * Created with 凌神.
 * Description: 商品上下架状态
 * User: 87179
 * Date: 2018-12-04
 * Time: 21:35
 */
@Getter
public enum ProductStatusEnum {

    /**
     * 在架
     */
    UP(0, "在架"),

    /**
     * 下架
     */
    DOWN(1, "下架");

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
