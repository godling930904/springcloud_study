package com.godling.product.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created with 凌神.
 * Description:
 * User: 87179
 * Date: 2019-01-17
 * Time: 23:14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarDTO {

    /**
     * 商品ID
     */
    private String productId;

    /**
     * 商品数量
     */
    private Integer productQuantity;
}
