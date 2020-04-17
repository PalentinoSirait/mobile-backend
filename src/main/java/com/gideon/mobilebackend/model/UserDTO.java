package com.gideon.mobilebackend.model;

public class UserDTO {

  public UserDTO(long id, String name, boolean status) {
    this.id = id;
    this.name = name;
    this.status = status;
  }

  public UserDTO() {
  }

  private long id;
  private String name;
  private boolean status;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isStatus() {
    return status;
  }

  public void setStatus(boolean status) {
    this.status = status;
  }

}
