package com.thoughtworks.api.web;

import com.thoughtworks.api.support.ApiSupport;
import com.thoughtworks.api.support.ApiTestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@RunWith(ApiTestRunner.class)
public class ProductsApiTest extends ApiSupport{
  @Test
  public void should_import_product_success() throws Exception {
    Map<String, Object> productInfo = new HashMap<String, Object>() {{
      put("name", "desk");
      put("description", "black");
      put("price", 530);
      put("rating", 5);
    }};

    final Response post = post("/users", productInfo);
    assertThat(post.getStatus(), is(201));
  }
}
