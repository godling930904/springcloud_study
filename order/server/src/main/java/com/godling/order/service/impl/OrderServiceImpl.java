package com.godling.order.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.convert.Convert;
import cn.hutool.core.util.StrUtil;
import com.godling.order.client.ProductClient;
import com.godling.order.dto.CarDTO;
import com.godling.order.dto.OrderDTO;
import com.godling.order.entity.OrderDetail;
import com.godling.order.entity.OrderMaster;
import com.godling.order.entity.ProductInfo;
import com.godling.order.enums.OrderStatusEnum;
import com.godling.order.enums.PayStatusEnum;
import com.godling.order.repository.OrderDetailRepository;
import com.godling.order.repository.OrderMasterRepository;
import com.godling.order.service.OrderService;
import com.godling.order.utils.KeyUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created with 凌神.
 * Description:
 * User: 87179
 * Date: 2018-12-29
 * Time: 21:11
 */
@Slf4j
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDetailRepository detailRepository;

    @Autowired
    private OrderMasterRepository masterRepository;

    @Autowired
    private ProductClient productClient;

    @Override
    public OrderDTO create(OrderDTO orderDTO) {
        String orderId = KeyUtil.genUniqueKey();
        // 获取商品信息(调用商品服务)
        List<String> productIdList = orderDTO.getDetailList()
                .stream()
                .map(OrderDetail::getProductId)
                .collect(Collectors.toList());
        List<ProductInfo> productList = productClient.findProductList(productIdList);
        // 计算商品总价
        BigDecimal orderAmout = BigDecimal.ZERO;
        for (OrderDetail orderDetail : orderDTO.getDetailList()) {
            for (ProductInfo productInfo : productList) {
                //单商品的总价
                if (StrUtil.equals(productInfo.getProductId(), orderDetail.getProductId())) {
                    orderAmout = productInfo.getProductPrice().multiply(Convert
                            .toBigDecimal(orderDetail.getProductQuantity()))
                            .add(orderAmout);
                    BeanUtil.copyProperties(productInfo, orderDetail);
                    orderDetail.setOrderId(orderId);
                    orderDetail.setDetailId(KeyUtil.genUniqueKey());
                    detailRepository.save(orderDetail);
                }
            }
        }
        // 扣库存
        List<CarDTO> carDTOList = orderDTO.getDetailList()
                .stream()
                .map(orderDetail -> new CarDTO(orderDetail.getProductId(), orderDetail.getProductQuantity()))
                .collect(Collectors.toList());
        productClient.decreaseStock(carDTOList);
        // 4.订单入库
        OrderMaster orderMaster = new OrderMaster();
        BeanUtils.copyProperties(orderDTO, orderMaster);
        orderMaster.setOrderAmount(orderAmout);
        orderMaster.setOrderStatus(OrderStatusEnum.NEW.getCode());
        orderMaster.setPayStatus(PayStatusEnum.WAIT.getCode());
        //ObjectId是MongoDB数据库的一种唯一ID生成策略
        orderMaster.setOrderId(orderId);
        orderMaster.setCreateTime(new Date());
        orderMaster.setUpdateTime(new Date());
        orderDTO.setOrderId(orderId);
        masterRepository.save(orderMaster);
        return orderDTO;
    }
}
