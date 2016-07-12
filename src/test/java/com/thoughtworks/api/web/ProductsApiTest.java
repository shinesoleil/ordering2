package com.thoughtworks.api.web;

import com.thoughtworks.api.support.ApiSupport;
import com.thoughtworks.api.support.ApiTestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.ws.rs.core.Response;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@RunWith(ApiTestRunner.class)
public class ProductsApiTest extends ApiSupport{
  @Test
  public void should_import_user_success() throws Exception {

    final Response get = get("/products");
    assertThat(get.getStatus(), is(201));
  }
}
