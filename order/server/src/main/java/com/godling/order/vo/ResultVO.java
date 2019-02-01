package com.godling.order.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created with 凌神.
 * Description:
 * User: 87179
 * Date: 2019-01-03
 * Time: 20:44
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultVO<T> {

    private Integer code;

    private String msg;

    private T data;


}
