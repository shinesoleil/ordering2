package com.thoughtworks.api.infrastructure.repositories;

import com.google.inject.Inject;
import com.thoughtworks.api.support.DatabaseTestRunner;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(DatabaseTestRunner.class)
public class ProductRepositoryTest {

  @Inject
  ProductRepository productRepository;

  public void should_create_and_get_product() {
    String id = productRepository.generateId();
    Product product = new Product(id, "desk", "black", 530, 4);

    Product createdProduct = productRepository.create(product);

    assertThat(product, is(createdProduct));
  }

}
