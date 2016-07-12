package com.thoughtworks.api.web;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("products")
public class ProductsApi {

  @GET
  public Response getUsers() {
    return Response.status(201).build();
  }
}
