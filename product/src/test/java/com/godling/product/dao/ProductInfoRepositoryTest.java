package com.godling.product.dao;

import com.godling.product.entity.ProductInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Test
    public void test1() {
        List<ProductInfo> byProductStatus = productInfoRepository.findByProductStatus(0);
        for (ProductInfo productStatus : byProductStatus) {
            System.out.println(productStatus.getProductDescription());
        }
    }
}