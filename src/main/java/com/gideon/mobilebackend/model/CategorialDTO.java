package com.gideon.mobilebackend.model;

import lombok.Data;

import java.util.Date;

@Data
public class CategorialDTO {

  public CategorialDTO() {
  }

  public CategorialDTO(String name, String description) {
    this.name = name;
    this.description = description;
  }

  private String id;
  private String name;
  private String description;
  private Date lastUpdatedDate;
  private String lastUpdatedBy;

}
