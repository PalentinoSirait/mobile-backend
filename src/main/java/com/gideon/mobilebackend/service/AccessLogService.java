package com.gideon.mobilebackend.service;

import com.gideon.mobilebackend.persistence.AccessLog;
import com.gideon.mobilebackend.persistence.AccessLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class AccessLogService {

  @Autowired
  AccessLogRepository accessLogRepository;

  public List<AccessLog> fetch() {
    return (List<AccessLog>) accessLogRepository.findAll();
  }

  public void create(String clientIP) {
    AccessLog log = new AccessLog();
    log.setIpAddress(clientIP);
    log.setTimestamp(new Date());
    accessLogRepository.save(log);
  }

}
