package com.enterprise.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.enterprise.api.Models.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByEmail(String email);
    User findByName(String name);
}