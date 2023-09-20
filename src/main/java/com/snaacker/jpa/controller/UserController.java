package com.snaacker.jpa.controller;

import com.snaacker.jpa.persistent.User;
import com.snaacker.jpa.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class UserController {
  @Autowired
  UserService userService;

  @GetMapping("/users")
  public List<User> getAllUser(){
    return (List<User>) userService.getUser();
  }

  @PostMapping("/users")
  public User createUser(User newUser){
    return userService.createUser(newUser);
  }
}
