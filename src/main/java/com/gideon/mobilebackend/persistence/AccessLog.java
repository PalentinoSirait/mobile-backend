package com.gideon.mobilebackend.persistence;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "ACCESS_LOG")
public class AccessLog {

  @Id
  @GeneratedValue(generator = "system-uuid")
  @GenericGenerator(name = "system-uuid", strategy = "uuid")
  @Column(name = "ID")
  private String id;

  @Column(name = "IP_ADDRESS")
  private String ipAddress;

  @Column(name = "TIMESTAMP")
  private Date timestamp;

  @Column(name = "SESSION_ID")
  private String sessionId;

}
