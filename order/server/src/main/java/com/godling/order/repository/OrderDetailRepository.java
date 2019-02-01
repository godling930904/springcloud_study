package com.godling.order.repository;

import com.godling.order.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created with 凌神.
 * Description:
 * User: 87179
 * Date: 2018-12-29
 * Time: 20:24
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {
}
