package com.thoughtworks.api.domain.core;

import java.util.Date;

public interface Payment {
  String getOrderId();
  void setOrderId(String orderId);

  String getPayType();
  void setPayType(String payType);

  float getAmount();
  void setAmount(float amount);

  Date getPayTime();
  void setPayTime(Date payTime);
}
