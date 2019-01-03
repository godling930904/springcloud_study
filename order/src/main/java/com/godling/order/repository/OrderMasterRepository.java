package com.godling.order.repository;

import com.godling.order.entity.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created with 凌神.
 * Description:
 * User: 87179
 * Date: 2018-12-29
 * Time: 20:25
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster, String> {
}
