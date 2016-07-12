package com.thoughtworks.api.domain.core;

public interface OrderItem {
  String getId();
  void setId(String id);

  float getAmount();
  void setAmount(float amount);

  int getQuantity();
  void setQuantity(int quantity);

  String getOrderId();
  void setOrderId(String orderId);

  String getProductId();
  void setProductId(String productId);
}
