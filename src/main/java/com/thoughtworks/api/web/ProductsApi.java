package com.thoughtworks.api.web;

import com.thoughtworks.api.domain.core.Product;
import com.thoughtworks.api.domain.core.ProductRepository;
import com.thoughtworks.api.infrastructure.records.ProductRecord;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;

@Path("products")
public class ProductsApi {
  @Context
  ProductRepository productRepository;

  @GET
  @Path("{productId}")
  @Produces(MediaType.APPLICATION_JSON)
  public Product getProductById(@PathParam("productId") String productId) {
    return productRepository.findById(productId);
  }

  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  public Response createProduct(HashMap info) {
    Product product = new ProductRecord(productRepository.generateId(),
      info.get("name").toString(),
      info.get("description").toString(),
      Float.valueOf(info.get("price").toString()),
      (int) info.get("rating"));


    if (productRepository.create(product) != null) {
      return Response.status(201).build();
    } else {
      return Response.status(400).build();
    }
  }
}
