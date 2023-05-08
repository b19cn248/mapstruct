package com.example.mapstructdemo.v2;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface ProductMapper {
  @Mapping(target = "id", source = "productId")
  @Mapping(target = "name", source = "productName")
  ProductDTO productToProductDTO(Product product);
}
