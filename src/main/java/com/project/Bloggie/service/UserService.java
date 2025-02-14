package com.project.Bloggie.service;

import com.project.Bloggie.models.UserDetails;
import com.project.Bloggie.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public UserDetails createUser(UserDetails user) {
        return userRepository.save(user);
    }

    public List<UserDetails> getAllUsers() {
        return userRepository.findAll();
    }

    public UserDetails getUserById(int id) {
        return userRepository.findById(id).orElse(null);
    }
}
