package com.emp.backend.service;

import com.emp.backend.model.User;

import java.util.List;

public interface UserServiceInterface {
    List<User> getAllUsers();
    User createUser(User user);
}