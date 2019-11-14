package com.kons.controller;

import com.kons.beans.User;
import com.kons.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserController {
    @Autowired
    private UserService userService;

    public User getUser(int id){
        return userService.obtainUserById(id);
    }
}
