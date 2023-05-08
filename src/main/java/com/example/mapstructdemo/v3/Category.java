package com.example.mapstructdemo.v3;

import java.util.Date;

public class Category {
  private int id;
  private String name;
  private Date create_at;

  public Category() {
  }

  public Category(int id, String name, Date create_at) {
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

  public Date getCreate_at() {
    return create_at;
  }

  public void setCreate_at(Date create_at) {
    this.create_at = create_at;
  }

  @Override
  public String toString() {
    return "Category{" +
          "id=" + id +
          ", name='" + name + '\'' +
          ", create_at=" + create_at +
          '}';
  }
}
