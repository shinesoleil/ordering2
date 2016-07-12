package com.thoughtworks.api.web;

import com.thoughtworks.api.domain.core.Product;
import com.thoughtworks.api.infrastructure.records.ProductRecord;
import com.thoughtworks.api.infrastructure.repositories.ProductRepository;
import com.thoughtworks.api.support.ApiSupport;
import com.thoughtworks.api.support.ApiTestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@RunWith(ApiTestRunner.class)
public class ProductsApiTest extends ApiSupport{
  @Inject
  ProductRepository productRepository;

  @Test
  public void should_import_product_success() throws Exception {
    Map<String, Object> productInfo = new HashMap<String, Object>() {{
      put("name", "desk");
      put("description", "black");
      put("price", 530);
      put("rating", 5);
    }};

    final Response post = post("/products", productInfo);
    assertThat(post.getStatus(), is(201));
  }

  @Test
  public void should_get_product_by_id() throws Exception {
    String id = productRepository.generateId();

    Product product = new ProductRecord(id, "desk", "black", 530, 4);

    productRepository.create(product);

    final Response get = get("/products/" + id);

    final Product res = get.readEntity(ProductRecord.class);

    assertThat(res, is(product));
  }

  @Test
  public void should_return_400_if_not_found_by_id() throws Exception {
    String id = productRepository.generateId();

    final Response get = get("/products/" + id);
    assertThat(get.getStatus(), is(204));
  }
}
