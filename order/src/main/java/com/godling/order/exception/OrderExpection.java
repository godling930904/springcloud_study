package com.godling.order.exception;

import com.godling.order.enums.ResultEnum;

/**
 * Created with 凌神.
 * Description:
 * User: 87179
 * Date: 2019-01-03
 * Time: 20:23
 */
public class OrderExpection extends RuntimeException {
    private Integer code;

    public OrderExpection(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public OrderExpection(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
