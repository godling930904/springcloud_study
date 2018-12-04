package com.godling.product.service.impl;

import com.godling.product.entity.ProductCategory;
import com.godling.product.service.CategoryService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Created with 凌神.
 * Description:
 * User: 87179
 * Date: 2018-12-04
 * Time: 22:00
 */
public class CategoryServiceImplTest extends ProductServiceImplTest {

    @Autowired
    private CategoryService categoryService;

    @Test
    public void findByCategoryTypeIn() {
        List<ProductCategory> byCategoryTypeIn = categoryService.findByCategoryTypeIn(Arrays.asList(11, 22));
        assertTrue(byCategoryTypeIn.size() > 0);
    }
}