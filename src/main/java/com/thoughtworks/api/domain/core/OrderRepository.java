package com.thoughtworks.api.domain.core;

public interface OrderRepository {
  String generateId();

  Order create(Order order);

  Order findById(String id);
}
