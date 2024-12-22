package com.emp.backend.service;

import com.emp.backend.model.User;
import com.emp.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserServiceInterface {

    @Autowired
    UserRepository userRepository;
    @Override
    public List<User> getAllUsers() {
        try {
            return userRepository.findAll();
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return List.of();
    }

    @Override
    public User createUser(User user) {
        try {
            return userRepository.save(user);
        }
            catch (Exception e) {
            System.out.println(e);
        }
        return user;
    }
}
