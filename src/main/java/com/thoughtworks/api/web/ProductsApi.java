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
  public Response getProductById(@PathParam("productId") String productId) {
    if (productRepository.findById(productId) != null) {
      return Response.status(201).build();
    } else {
      return Response.status(400).build();
    }
  }

  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  public Response createProduct(HashMap info) {
    Product product = new ProductRecord();

    product.setId(productRepository.generateId());
    product.setName(info.get("name").toString());
    product.setDescription(info.get("description").toString());
    product.setPrice(Float.valueOf(info.get("price").toString()));
    product.setRating((int) info.get("rating"));

    if (productRepository.create(product) != null) {
      return Response.status(201).build();
    } else {
      return Response.status(400).build();
    }
  }
}
