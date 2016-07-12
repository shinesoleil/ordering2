package com.thoughtworks.api.infrastructure.repositories;


import com.thoughtworks.api.domain.core.Product;
import com.thoughtworks.api.domain.core.ProductRepository;
import com.thoughtworks.api.infrastructure.records.ProductRecord;
import com.thoughtworks.api.support.DatabaseTestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(DatabaseTestRunner.class)
public class ProductRepositoryTest {

  @Inject
  ProductRepository productRepository;

  @Test
  public void should_create_and_get_product() {
    String id = productRepository.generateId();

    Product product = new ProductRecord(id, "desk", "black", 530, 4);

    Product createdProduct = productRepository.create(product);

    assertThat(product, is(createdProduct));
  }

}
