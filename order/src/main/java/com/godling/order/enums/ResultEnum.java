package com.godling.order.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Created with 凌神.
 * Description:
 * User: 87179
 * Date: 2019-01-03
 * Time: 20:26
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum ResultEnum {
    /**
     * 错误码1----参数异常
     */
    PARAM_ERROR(1, "参数错误"),

    /**
     * 购物车情况
     */
    CART_EMPTY(2, "购物车为空"),
    ;
    private Integer code;
    private String message;


}
