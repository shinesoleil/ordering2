package com.thoughtworks.api.domain.core;

public interface Product {
  String getId();
  void setId(String id);

  String getName();
  void setName(String name);

  String getDescription();
  void setDescription(String description);

  float getPrice();
  void setPrice(float price);

  int getRating();
  void setRating(int rating);
}
