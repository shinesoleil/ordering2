package com.thoughtworks.api.infrastructure.mybatis.mappers;

import com.thoughtworks.api.domain.user.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    void save(@Param("user") User user);

    User findById(@Param("Id") String id);
}
