package com.gideon.mobilebackend.service;

import com.gideon.mobilebackend.model.UserDTO;
import com.gideon.mobilebackend.persistence.User;
import com.gideon.mobilebackend.persistence.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

  @Autowired
  UserRepository userRepository;

  public List<User> getAllUser() {
    return (List<User>) userRepository.findAll();
  }

  public User getById(long id) {
    return userRepository.findById(id).orElse(null);
  }

  public User create(UserDTO payload) {
    User data = new User();
    data.setName(payload.getName());
    data.setStatus(payload.isStatus());
    userRepository.save(data);
    return data;
  }

  public void update(long id, UserDTO payload) {
    User data = userRepository.findById(id).orElse(null);
    if (data != null) {
      data = this.updateValue(data, payload);
      userRepository.save(data);
    }
  }

  public void delete(long id) {
    User user = userRepository.findById(id).orElse(null);
    if (user != null) userRepository.delete(user);
  }

  private User updateValue(User data, UserDTO payload) {
    if (!payload.getName().isEmpty()) {
      data.setName(payload.getName());
    }
    data.setStatus(payload.isStatus());
    return data;
  }

}
