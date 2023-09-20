package com.snaacker.jpa.service;

import com.snaacker.jpa.persistent.User;
import com.snaacker.jpa.repository.UserRepository;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.sql.ast.tree.expression.Collation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  @Autowired
  UserRepository userRepository;
  public User createUser(User user){
    return userRepository.save(user);
  }

  public Iterable<User> getUser() {
    return userRepository.findAll();
  }
}
