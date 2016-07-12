package com.thoughtworks.api.infrastructure.records;

import com.thoughtworks.api.domain.core.Product;
import com.thoughtworks.api.web.jersey.Routes;

import java.util.HashMap;
import java.util.Map;

public class ProductRecord implements Product {
  private String id;
  private String name;
  private String description;
  private float price;
  private int rating;

  public ProductRecord(String id, String name, String description, float price, int rating) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.price = price;
    this.rating = rating;
  }


  @Override
  public String getId() {
    return this.id;
  }

  @Override
  public void setId(String id) {
    this.id = id;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String getDescription() {
    return this.description;
  }

  @Override
  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public float getPrice() {
    return this.price;
  }

  @Override
  public void setPrice(float price) {
    this.price = price;
  }

  @Override
  public int getRating() {
    return this.rating;
  }

  @Override
  public void setRating(int rating) {
    this.rating = rating;
  }

  @Override
  public Map<String, Object> toRefJson(Routes routes) {
    Map<String, Object> refJson = new HashMap<>();
    return refJson;
  }

  @Override
  public Map<String, Object> toJson(Routes routes) {
    Map<String, Object> json = new HashMap<>();

    return json;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ProductRecord that = (ProductRecord) o;

    if (Float.compare(that.price, price) != 0) return false;
    if (rating != that.rating) return false;
    if (id != null ? !id.equals(that.id) : that.id != null) return false;
    if (name != null ? !name.equals(that.name) : that.name != null) return false;
    return description != null ? description.equals(that.description) : that.description == null;

  }

  @Override
  public int hashCode() {
    int result = id != null ? id.hashCode() : 0;
    result = 31 * result + (name != null ? name.hashCode() : 0);
    result = 31 * result + (description != null ? description.hashCode() : 0);
    result = 31 * result + (price != +0.0f ? Float.floatToIntBits(price) : 0);
    result = 31 * result + rating;
    return result;
  }
}
