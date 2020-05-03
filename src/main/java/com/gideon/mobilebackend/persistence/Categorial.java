package com.gideon.mobilebackend.persistence;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "CATEGORIAL")
public class Categorial {

  @Id
  @GeneratedValue(generator = "system-uuid")
  @GenericGenerator(name = "system-uuid", strategy = "uuid")
  @Column(name = "ID", length = 36, nullable = false)
  private String id;

  @Column(name = "NAME", length = 100, nullable = false)
  private String name;

  @Column(name = "DESCRIPTION")
  private String description;

  @Column(name = "LAST_EDITED_DATE")
  private Date lastUpdatedDate;

  @Column(name = "LAST_EDITED_BY")
  private String lastUpdatedBy;

  @OneToMany(mappedBy = "categorial", cascade = CascadeType.ALL)
  private List<CategorialActs> categorialActs;

}
