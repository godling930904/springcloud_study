package com.godling.order.dto;

import com.godling.order.entity.OrderDetail;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created with 凌神.
 * Description:
 * User: 87179
 * Date: 2018-12-29
 * Time: 21:08
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {

    private String orderId;

    /**
     * 买家名字
     */
    private String buyerName;

    /**
     * 买家电话
     */
    private String buyerPhone;

    /**
     * 买家地址
     */
    private String buyerAddress;

    /**
     * 买家微信openid
     */
    private String buyerOpenid;

    /**
     * 订单总金额
     */
    private BigDecimal orderAmount;

    /**
     * 订单状态, 默认为新下单
     */
    private Byte orderStatus;

    /**
     * 支付状态, 默认未支付
     */
    private Byte payStatus;


    /**
     * 订单详情
     */
    private List<OrderDetail> detailList;

}
