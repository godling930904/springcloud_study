package com.godling.product.dao;

import com.godling.product.entity.ProductCategory;
import com.google.common.collect.Lists;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Test
    public void test1() {
        List<Integer> integers = Lists.newArrayList(22, 11);
        List<ProductCategory> byCategoryTypeIn = productCategoryRepository.findByCategoryTypeIn(integers);
        Assert.assertTrue(byCategoryTypeIn.size() > 0);
    }

}