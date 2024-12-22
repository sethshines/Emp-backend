package com.emp.backend.controller;

import com.emp.backend.model.User;
import com.emp.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService = new UserService();

    @GetMapping()
    List<User> getAllUsers() {

        List<User> users  = userService.getAllUsers();
        System.out.println(users);
        return users;
    }

    @PostMapping()
    User createUser(){
        return userService.createUser(new User());
    }
}
