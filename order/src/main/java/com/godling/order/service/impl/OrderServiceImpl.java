package com.godling.order.service.impl;

import com.godling.order.dto.OrderDTO;
import com.godling.order.entity.OrderMaster;
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

    @Override
    public OrderDTO create(OrderDTO orderDTO) {
        // TODO 1.获取商品信息(调用商品服务)
        // TODO 2.计算商品总价
        // TODO 3.扣库存
        // 4.订单入库
        OrderMaster orderMaster = new OrderMaster();
        orderDTO.setOrderId(KeyUtil.genUniqueKey());
        BeanUtils.copyProperties(orderDTO, orderMaster);
        orderMaster.setOrderAmount(new BigDecimal(5));
        orderMaster.setOrderStatus(OrderStatusEnum.NEW.getCode());
        orderMaster.setPayStatus(PayStatusEnum.WAIT.getCode());
        //ObjectId是MongoDB数据库的一种唯一ID生成策略
//        orderMaster.setOrderId(IdUtil.objectId());
        orderMaster.setCreateTime(new Date());
        orderMaster.setUpdateTime(new Date());
        masterRepository.save(orderMaster);
        return orderDTO;
    }
}
