package com.thoughtworks.api.infrastructure.mybatis.mappers;

import com.thoughtworks.api.domain.core.Order;
import org.apache.ibatis.annotations.Param;

public interface OrderMapper {
  void save(@Param("order") Order order);

  Order findById(@Param("userId") String userId,
                 @Param("orderId") String orderId);
}
