package com.gideon.mobilebackend.service;

import com.gideon.mobilebackend.model.CategorialDTO;
import com.gideon.mobilebackend.persistence.Categorial;
import com.gideon.mobilebackend.persistence.CategorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CategorialService {

  @Autowired
  CategorialRepository categorialRepository;

  public List<Categorial> fetch() {
    return (List<Categorial>) categorialRepository.findAll();
  }

  public Categorial getById(String id) {
    return categorialRepository.findById(id).orElse(null);
  }

  public void create(CategorialDTO payload) {
    Categorial data = new Categorial();
    data.setName(payload.getName());
    data.setDescription(payload.getDescription());
    data.setLastUpdatedDate(new Date());
    data.setLastUpdatedBy("system");
    categorialRepository.save(data);
  }

}
