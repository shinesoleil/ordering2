package com.thoughtworks.api.domain.core;

public interface PaymentRepository {
  String generateId();

  Payment save(Payment payment);

  Payment findByOrderId(String orderId);
}
