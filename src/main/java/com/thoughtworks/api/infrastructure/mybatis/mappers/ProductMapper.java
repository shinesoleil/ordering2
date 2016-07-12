package com.thoughtworks.api.infrastructure.mybatis.mappers;

import org.apache.ibatis.annotations.Param;

public interface ProductMapper {
  void save(@Param("id") String id,
            @Param("name") String name,
            @Param("description") String description,
            @Param("price") float price,
            @Param("rating") int rating);


}
