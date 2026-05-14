package com.enterprise.api.services;

import com.enterprise.api.Models.User;
import java.util.List;

public interface UserServiceInterface {

    User createUser(User user);

    List<User> getAllUsers();

    User findByEmail(String email);

    User findByName(String name);

    User findById(Integer id);

    User updateUser(Integer id, User user);

    User deleteUser(Integer id);
}