package com.enterprise.api.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;
import com.enterprise.api.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/user")
public class UserController {

    UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("")
    public String createUser() {
        return userService.createUser();
    }

    @GetMapping("")
    public String getUser() {
        return "{'message': 'Get request received'}";
    }

    @PutMapping("")
    public String updateUser() {
        return "{'message': 'Put request received'}";
    }

    @DeleteMapping("")
    public String deleteUser() {
        return "{'message': 'Delete request received'}";
    }
}