package com.gideon.mobilebackend.controller;

import com.gideon.mobilebackend.model.CategorialDTO;
import com.gideon.mobilebackend.persistence.Categorial;
import com.gideon.mobilebackend.service.CategorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.List;

@EnableWebMvc
@RestController
@RequestMapping(value = "/categorial", produces = MediaType.APPLICATION_JSON_VALUE)
public class CategorialController {

  @Autowired
  CategorialService categorialService;

  @GetMapping("")
  public ResponseEntity<List<Categorial>> fetchAll() {
    return ResponseEntity.status(200).body(categorialService.fetch());
  }

  @GetMapping("/{id}")
  public ResponseEntity<Categorial> findOne(@PathVariable(name = "id") String id) {
    return ResponseEntity.status(200).body(categorialService.getById(id));
  }

  @PostMapping("")
  public void create(@RequestBody CategorialDTO payload) {
    // tes
    categorialService.create(payload);
  }

}
