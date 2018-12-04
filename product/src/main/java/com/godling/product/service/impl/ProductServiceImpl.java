package com.godling.product.service.impl;

import com.godling.product.dao.ProductInfoRepository;
import com.godling.product.entity.ProductInfo;
import com.godling.product.enums.ProductStatusEnum;
import com.godling.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Override
    public List<ProductInfo> findAllUp() {
        return productInfoRepository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }
}
