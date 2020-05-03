package com.gideon.mobilebackend.persistence;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "CATEGORIAL_ACTS")
public class CategorialActs {

  @Id
  @GeneratedValue(generator = "system-uuid")
  @GenericGenerator(name = "system-uuid", strategy = "uuid")
  @Column(name = "ID")
  private String id;

  @ManyToOne()
  @JoinColumn(name = "CATEGORIAL_ID")
  private Categorial categorial;

  @Column(name = "DESCRIPTION")
  private String description;

  @Column(name = "STATUS")
  private boolean status;

  @Column(name = "HELD_DATE")
  private Date heldDate;

  @Column(name = "CREATED_DATE")
  private Date createdDate;

  @Column(name = "CREATED_BY")
  private String createdBy;

}
