package com.gideon.mobilebackend.controller;

import com.gideon.mobilebackend.model.UserDTO;
import com.gideon.mobilebackend.persistence.User;
import com.gideon.mobilebackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.List;

@EnableWebMvc
@RestController
@RequestMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {

  @Autowired
  UserService userService;

  @GetMapping("")
  public ResponseEntity<List<User>> fetchUser() {
    return ResponseEntity.status(200).body(userService.getAllUser());
  }

  @GetMapping("/{id}")
  public ResponseEntity<User> findOne(@PathVariable(name = "id") String id) {
    return ResponseEntity.status(200).body(userService.getById(Long.parseLong(id)));
  }

  @PostMapping("")
  public void create(@RequestBody UserDTO payload) {
    userService.create(payload);
  }

  @PutMapping("{id}")
  public void update(@PathVariable String id, @RequestBody UserDTO payload) {
    userService.update(Long.parseLong(id), payload);
  }

  @DeleteMapping("{id}")
  public void delete(@PathVariable String id) {
    userService.delete(Long.parseLong(id));
  }

}
