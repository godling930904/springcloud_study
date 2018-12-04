package com.godling.product.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created with 凌神.
 * Description:
 * User: 87179
 * Date: 2018-12-04
 * Time: 22:17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductVO {

    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private String categoryType;

    @JsonProperty("foods")
    List<ProductInfoVO> productInfoVOList;
}
