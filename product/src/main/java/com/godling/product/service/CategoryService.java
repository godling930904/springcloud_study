package com.godling.product.service;

import com.godling.product.entity.ProductCategory;

import java.util.List;

/**
 * Created with 凌神.
 * Description:
 * User: 87179
 * Date: 2018-12-04
 * Time: 21:58
 */
public interface CategoryService {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
