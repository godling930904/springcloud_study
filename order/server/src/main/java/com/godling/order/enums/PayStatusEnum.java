package com.godling.order.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Created with 凌神.
 * Description:
 * User: 87179
 * Date: 2018-12-29
 * Time: 20:56
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum PayStatusEnum {

    /**
     * 支付的状态 - 0 - 等待支付/未支付
     */
    WAIT(0, "等待支付"),

    /**
     * 支付的状态 - 1 - 成功支付
     */
    SUCCESS(1, "支付成功"),
    ;
    private Integer code;
    private String message;
}
