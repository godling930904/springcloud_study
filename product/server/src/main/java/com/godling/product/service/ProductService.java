package com.godling.product.service;

import com.godling.product.dto.CarDTO;
import com.godling.product.entity.ProductInfo;

import java.util.List;

public interface ProductService {

    List<ProductInfo> findAllUp();

    /**
     * 查询商品列表
     *
     * @param productIdList 商品的id的集合
     * @return 查询到的商品信息
     */
    List<ProductInfo> findList(List<String> productIdList);

    /**
     * 扣库存
     *
     * @param carDTOList 购物车信息
     */
    void decreaseStock(List<CarDTO> carDTOList);
}
