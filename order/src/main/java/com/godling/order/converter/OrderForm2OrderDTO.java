package com.godling.order.converter;

import com.godling.order.dto.OrderDTO;
import com.godling.order.entity.OrderDetail;
import com.godling.order.enums.ResultEnum;
import com.godling.order.exception.OrderExpection;
import com.godling.order.form.OrderForm;
import com.google.common.collect.Lists;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * Created with 凌神.
 * Description:
 * User: 87179
 * Date: 2019-01-03
 * Time: 20:29
 */
@Slf4j
public class OrderForm2OrderDTO {
    public static OrderDTO convert(OrderForm orderForm) {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setBuyerName(orderForm.getName());
        orderDTO.setBuyerPhone(orderForm.getPhone());
        orderDTO.setBuyerAddress(orderForm.getAddress());
        orderDTO.setBuyerOpenid(orderForm.getOpenid());
        List<OrderDetail> orderDetails = Lists.newArrayList();
        Gson gson = new Gson();
        try {
            orderDetails = gson.fromJson(orderForm.getItems(),
                    new TypeToken<List<OrderDetail>>() {
                    }.getType());
        } catch (JsonSyntaxException e) {
            log.error("[json转换]错误,string={}", orderForm.getItems());
            throw new OrderExpection(ResultEnum.PARAM_ERROR);
        }
        orderDTO.setDetailList(orderDetails);
        return orderDTO;

    }
}
