package com.gideon.mobilebackend;

import com.gideon.mobilebackend.persistence.AccessLogRepository;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.context.annotation.Configuration
public class SpringConfig {

  @Autowired
  AccessLogRepository accessLogRepository;

}
