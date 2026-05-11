package com.enterprise.api.services;

import org.springframework.stereotype.Service;
import com.enterprise.api.Models.User;
import java.util.List;
import com.enterprise.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserService implements UserServiceInterface {

    @Autowired
    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user){
        return userRepository.save(user);
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }   
}
