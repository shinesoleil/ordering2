package com.thoughtworks.api.domain.core;

public interface ProductRepository {
  String generateId();

  Product create(Product product);

}
