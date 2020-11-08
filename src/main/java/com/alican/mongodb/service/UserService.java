package com.alican.mongodb.service;

import com.alican.mongodb.entity.User;

import java.util.List;

public interface UserService {

    User save(User user);

    List<User> getAll();
}
