package com.example.mapstructdemo.v2;

public class ProductDTO {
  private String id;
  private String name;

  public ProductDTO() {
  }

  public ProductDTO(String id, String name) {
    this.id = id;
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "ProductDTO{" +
          "id='" + id + '\'' +
          ", name='" + name + '\'' +
          '}';
  }
}
