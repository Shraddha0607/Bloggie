package com.project.Bloggie.controller;

import com.project.Bloggie.models.UserDetails;
import com.project.Bloggie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public UserDetails createUser(@RequestBody UserDetails user) {
        return userService.createUser(user);
    }

    @GetMapping
    public List<UserDetails> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public UserDetails getUserById(@PathVariable int id) {
        return userService.getUserById(id);
    }
}

