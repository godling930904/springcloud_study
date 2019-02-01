package com.godling.order.client;

import com.godling.order.dto.CarDTO;
import com.godling.order.entity.ProductInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
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
@FeignClient(name = "product")
public interface ProductClient {


    @GetMapping("/msg")
    String getProductMsg();

    /**
     * 获取商品信息
     *
     * @return 接口数据
     */
    @PostMapping("/product/listForOrder")
    List<ProductInfo> findProductList(@RequestBody List<String> productIds);

    /**
     * 扣除库存的接口
     */
    @PostMapping("/product/decreaseStock")
    void decreaseStock(@RequestBody List<CarDTO> carDTOList);
}
