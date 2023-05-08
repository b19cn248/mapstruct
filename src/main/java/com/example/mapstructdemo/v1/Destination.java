package com.example.mapstructdemo.v1;

public class Destination {
  private String name;
  private String description;

  public Destination() {
  }

  public Destination(String name, String description) {
    this.name = name;
    this.description = description;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public String toString() {
    return "Destination{" +
          "name='" + name + '\'' +
          ", description='" + description + '\'' +
          '}';
  }
}