package com.example.mapstructdemo;

import com.example.mapstructdemo.v3.Category;
import com.example.mapstructdemo.v3.CategoryDTO;
import com.example.mapstructdemo.v3.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

  @Autowired
  private CategoryMapper categoryMapper;

  @GetMapping("/mapper")
  public Category test() {
    return categoryMapper.categoryDTOToCategory(new CategoryDTO(1,"Quan ao", 1683298336000L));
  }
}
