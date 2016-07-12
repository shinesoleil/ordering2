package com.thoughtworks.api.domain.core;

public interface UserRepository {
  String generateId();

  User create(User user);

  User findById(String id);
}
