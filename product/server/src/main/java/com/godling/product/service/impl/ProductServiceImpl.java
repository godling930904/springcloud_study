package com.godling.product.service.impl;

import com.godling.product.dao.ProductInfoRepository;
import com.godling.product.dto.CarDTO;
import com.godling.product.entity.ProductInfo;
import com.godling.product.enums.ProductStatusEnum;
import com.godling.product.enums.ResultEnum;
import com.godling.product.expection.ProductException;
import com.godling.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Override
    public List<ProductInfo> findAllUp() {
        return productInfoRepository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }

    @Override
    public List<ProductInfo> findList(List<String> productIdList) {
        return productInfoRepository.findByProductIdIn(productIdList);
    }

    @Override
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void decreaseStock(List<CarDTO> carDTOList) {
        carDTOList.forEach(carDTO -> {
            Optional<ProductInfo> productInfo = productInfoRepository.findById(carDTO.getProductId());
            //判断商品是否存在
            if (!productInfo.isPresent()) {
                throw new ProductException(ResultEnum.PRODUCT_NOT_EXIST);
            }
            ProductInfo productInfoReal = productInfo.get();
            //判断库存是否足够
            int leftStock = productInfoReal.getProductStock() - carDTO.getProductQuantity();
            if (leftStock < 0) {
                throw new ProductException(ResultEnum.PRODUCT_STOCK_ERROR);
            }
            productInfoReal.setProductStock(leftStock);
            productInfoRepository.save(productInfoReal);
        });
    }


}
