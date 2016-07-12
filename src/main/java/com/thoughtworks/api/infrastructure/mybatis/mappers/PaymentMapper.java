package com.thoughtworks.api.infrastructure.mybatis.mappers;

import com.thoughtworks.api.domain.core.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentMapper {
  void save(@Param("payment") Payment payment);

  Payment getByOrderId(@Param("orderId") String orderId);
}
