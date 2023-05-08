package com.example.mapstructdemo;

import com.example.mapstructdemo.v1.Destination;
import com.example.mapstructdemo.v1.SimpleMapper;
import com.example.mapstructdemo.v1.Source;
import com.example.mapstructdemo.v2.Product;
import com.example.mapstructdemo.v2.ProductDTO;
import com.example.mapstructdemo.v2.ProductMapper;
import com.example.mapstructdemo.v3.CategoryDTO;
import com.example.mapstructdemo.v3.CategoryMapper;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.assertj.core.api.Assertions.assertThat;

public class MapStructTest {
  private SimpleMapper simpleMapper = Mappers.getMapper(SimpleMapper.class);
  private ProductMapper productMapper = Mappers.getMapper(ProductMapper.class);
  private CategoryMapper categoryMapper = Mappers.getMapper(CategoryMapper.class);

  @Test
  public void test1() {
    Source source = new Source();
    source.setName("SourceName");
    source.setDescription("SourceDescription");
    Destination destination = simpleMapper.sourceToDestination(source);
    System.out.println(destination);
    assertThat(source.getName().equals(destination.getName()));
  }

  @Test
  public void test2() {
    Product product = new Product(1,"Iphone");
    ProductDTO productDTO = productMapper.productToProductDTO(product);
    System.out.println("Test 2:");
    System.out.println(productDTO);
  }

  @Test
  public void test3() {
    CategoryDTO categoryDTO = new CategoryDTO(1,"Quan ao", 1683298336000L);
    System.out.println(categoryMapper.categoryDTOToCategory(categoryDTO));
  }
}
