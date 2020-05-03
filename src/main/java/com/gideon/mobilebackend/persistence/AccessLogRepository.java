package com.gideon.mobilebackend.persistence;

import org.springframework.data.repository.CrudRepository;

public interface AccessLogRepository extends CrudRepository<AccessLog, String> {

}
