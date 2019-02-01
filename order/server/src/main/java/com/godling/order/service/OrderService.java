package com.godling.order.service;

import com.godling.order.dto.OrderDTO;

/**
 * Created with 凌神.
 * Description:
 * User: 87179
 * Date: 2018-12-29
 * Time: 21:06
 */
public interface OrderService {

    /**
     * 创建订单
     *
     * @param orderDTO 订单对象
     * @return
     */
    OrderDTO create(OrderDTO orderDTO);
}
