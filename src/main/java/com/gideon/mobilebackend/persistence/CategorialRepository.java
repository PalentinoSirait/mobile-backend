package com.gideon.mobilebackend.persistence;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategorialRepository extends CrudRepository<Categorial, String> {

  Optional<Categorial> findById(String id);

}
