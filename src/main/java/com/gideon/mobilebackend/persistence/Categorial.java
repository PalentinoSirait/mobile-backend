package com.gideon.mobilebackend.persistence;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "CATEGORIAL")
public class Categorial {

  @Id
  @GeneratedValue(generator = "system-uuid")
  @GenericGenerator(name = "system-uuid", strategy = "uuid")
  @Column(name = "ID")
  private String id;

  @Column(name = "NAME")
  private String name;

  @Column(name = "DESCRIPTION")
  private String description;

  @Column(name = "LAST_EDITED_DATE")
  private Date lastUpdatedDate;

  @Column(name = "LAST_EDITED_BY")
  private String lastUpdatedBy;

}
