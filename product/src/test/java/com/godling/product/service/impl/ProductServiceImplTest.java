package com.godling.product.service.impl;

import com.godling.product.entity.ProductInfo;
import com.godling.product.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created with 凌神.
 * Description:
 * User: 87179
 * Date: 2018-12-04
 * Time: 21:39
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {

    @Autowired
    private ProductService productService;

    @Test
    public void findAllUp() {
        List<ProductInfo> allUp = productService.findAllUp();
        assertTrue(allUp.size() > 0);
    }
}