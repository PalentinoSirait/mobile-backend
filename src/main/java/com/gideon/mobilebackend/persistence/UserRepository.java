package com.gideon.mobilebackend.persistence;

import com.gideon.mobilebackend.persistence.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {

  Optional<User> findById(long id);

}
