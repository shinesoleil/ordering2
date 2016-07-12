package com.thoughtworks.api.infrastructure.repositories;

import com.thoughtworks.api.domain.core.Product;

import java.util.UUID;

public class ProductRepository implements com.thoughtworks.api.domain.core.ProductRepository {
  @Override
  public String generateId() {
    return UUID.randomUUID().toString().replaceAll("-", "");
  }

  @Override
  public Product create(Product product) {
    return null;
  }
}
