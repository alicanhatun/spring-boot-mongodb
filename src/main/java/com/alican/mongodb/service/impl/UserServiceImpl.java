package com.alican.mongodb.service.impl;

import com.alican.mongodb.entity.User;
import com.alican.mongodb.repo.UserRepository;
import com.alican.mongodb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(User user) {
        User savedUser = userRepository.save(user);
        return savedUser;
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

}
