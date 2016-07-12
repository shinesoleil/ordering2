package com.thoughtworks.api.domain.core;

import com.thoughtworks.api.infrastructure.records.Record;

public interface Product extends Record {
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
