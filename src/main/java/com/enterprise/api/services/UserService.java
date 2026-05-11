package com.enterprise.api.Services;
import org.springframework.stereotype.Service;
import com.enterprise.api.services.UserServiceInterface;

@Service
public class UserService implements UserServiceInterface {

    public String createUser(){
        return "{'message':'hello'}";
    }

    public String getUser(){
        return "{'message':'hello'}";
    }

    public String updateUser(){
        return "{'message':'hello'}";
    }

    public String deleteUser(){
        return "{'message':'hello'}";
    }
}
