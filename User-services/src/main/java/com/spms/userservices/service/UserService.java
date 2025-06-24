package com.spms.userservices.service;

import com.spms.userservices.entity.User;
import com.spms.userservices.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    public UserRepo repo;

    public User register(User user) {
        return repo.save(user);
    }

    public User update(Long id, User updated) {
        User user = repo.findById(id).orElseThrow();
        user.setEmail(updated.getEmail());
        user.setRole(updated.getRole());
        return repo.save(user);
    }
    public User findByUsername(String username) {
        return repo.findByUsername(username).orElseThrow(() -> new RuntimeException("User not found"));
  }





}
