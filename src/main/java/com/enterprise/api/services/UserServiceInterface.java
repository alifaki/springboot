package com.enterprise.api.services;

import com.enterprise.api.Models.User;
import java.util.List;

public interface UserServiceInterface {

    User createUser(User user);

    List<User> getAllUsers();
}