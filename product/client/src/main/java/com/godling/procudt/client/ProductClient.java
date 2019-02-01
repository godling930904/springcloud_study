package com.godling.procudt.client;

import com.godling.product.DecreaseStockInput;
import com.godling.product.ProductInfoOutput;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * Created with 凌神.
 * Description:
 * User: 87179
 * Date: 2019-01-17
 * Time: 22:39
 */
@FeignClient(name = "product", fallback = ProductClient.ProductClientFallback.class)
public interface ProductClient {

    /**
     * 获取商品信息
     *
     * @return 接口数据
     */
    @PostMapping("/product/listForOrder")
    List<ProductInfoOutput> findProductList(@RequestBody List<String> productIds);

    /**
     * 扣除库存的接口
     */
    @PostMapping("/product/decreaseStock")
    void decreaseStock(@RequestBody List<DecreaseStockInput> carDTOList);

    @Component
    static class ProductClientFallback implements ProductClient {

        @Override
        public List<ProductInfoOutput> findProductList(List<String> productIdList) {
            return null;
        }

        @Override
        public void decreaseStock(List<DecreaseStockInput> decreaseStockInputList) {

        }
    }
}
