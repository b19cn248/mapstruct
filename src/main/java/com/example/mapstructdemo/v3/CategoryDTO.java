package com.example.mapstructdemo.v3;

public class CategoryDTO {
  private int id;
  private String name;
  private Long create_at;

  public CategoryDTO() {
  }

  public CategoryDTO(int id, String name, Long create_at) {
    this.id = id;
    this.name = name;
    this.create_at = create_at;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Long getCreate_at() {
    return create_at;
  }

  public void setCreate_at(Long create_at) {
    this.create_at = create_at;
  }
}
