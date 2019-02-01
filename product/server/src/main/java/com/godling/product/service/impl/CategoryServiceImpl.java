package com.godling.product.service.impl;

import com.godling.product.dao.ProductCategoryRepository;
import com.godling.product.entity.ProductCategory;
import com.godling.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with 凌神.
 * Description: 类目
 * User: 87179
 * Date: 2018-12-04
 * Time: 21:58
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;


    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return productCategoryRepository.findByCategoryTypeIn(categoryTypeList);
    }
}
