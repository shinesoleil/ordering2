package com.thoughtworks.api.web;

import com.thoughtworks.api.domain.core.ProductRepository;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;

@Path("products")
public class ProductsApi {
  @Context
  ProductRepository productRepository;

//  @GET
//  public Response getUsers() {
//    return Response.status(201).build();
//  }

  @GET
  public String createProduct() {
    return productRepository.generateId();
  }
}
