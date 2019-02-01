package com.godling.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 减库存入参
 * Created by 廖师兄
 * 2018-01-20 22:50
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DecreaseStockInput {

    private String productId;

    private Integer productQuantity;

}