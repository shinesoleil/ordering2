package com.thoughtworks.api.infrastructure.repositories;

import com.thoughtworks.api.domain.core.Product;
import com.thoughtworks.api.infrastructure.mybatis.mappers.ProductMapper;

import javax.inject.Inject;
import java.util.UUID;

public class ProductRepository implements com.thoughtworks.api.domain.core.ProductRepository {
  @Inject
  ProductMapper productMapper;

  @Override
  public String generateId() {
    return UUID.randomUUID().toString().replaceAll("-", "");
  }

  @Override
  public Product create(Product product) {
    productMapper.save(product.getId(),
      product.getName(),
      product.getDescription(),
      product.getPrice(),
      product.getRating());

    return productMapper.findById(product.getId());
  }

  @Override
  public Product findById(String id) {
    return productMapper.findById(id);
  }
}
