package com.godling.order.controller;

import com.godling.order.converter.OrderForm2OrderDTO;
import com.godling.order.dto.OrderDTO;
import com.godling.order.enums.ResultEnum;
import com.godling.order.exception.OrderExpection;
import com.godling.order.form.OrderForm;
import com.godling.order.service.OrderService;
import com.godling.order.utils.ResultVOUtil;
import com.godling.order.vo.ResultVO;
import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with 凌神.
 * Description:
 * User: 87179
 * Date: 2018-12-29
 * Time: 21:05
 */
@Slf4j
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/create")
    public ResultVO<Map> create(@Valid OrderForm orderForm,
                                BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            log.error("[创建订单]参数不争取,orderForm={}", orderForm);
            throw new OrderExpection(ResultEnum.PARAM_ERROR.getCode(),
                    bindingResult.getFieldError().getDefaultMessage());
        }
        OrderDTO orderDTO = OrderForm2OrderDTO.convert(orderForm);
        if (CollectionUtils.isEmpty(orderDTO.getDetailList())) {
            log.error("[创建订单]购物车信息为空");
            throw new OrderExpection(ResultEnum.CART_EMPTY);
        }
        OrderDTO reslut = orderService.create(orderDTO);
        HashMap<String, String> map = Maps.newHashMap();
        map.put("orderId", reslut.getOrderId());
        return ResultVOUtil.success(map);
    }
}
