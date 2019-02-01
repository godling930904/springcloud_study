package com.godling.order.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Created with 凌神.
 * Description:
 * User: 87179
 * Date: 2018-12-29
 * Time: 20:30
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum OrderStatusEnum {
    /**
     * 订单状态 - 0 -新订单
     */
    NEW(0, "新订单"),

    /**
     * 订单状态 - 1 -订单完成
     */
    FINISHED(1, "完结"),

    /**
     * 订单状态 - 2 -取消
     */
    CANCEL(2, "取消"),
    ;
    private Integer code;
    private String message;
}
