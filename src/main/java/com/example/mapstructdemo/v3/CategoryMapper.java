package com.example.mapstructdemo.v3;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.springframework.stereotype.Component;

import java.util.Date;

@Mapper(componentModel = "spring")
@Component
public interface CategoryMapper {

  @Mapping(source = "create_at", target = "create_at", qualifiedByName = "dateToTimestamp")
  CategoryDTO categoryToCategoryDTO(Category category);

  @Mapping(source = "create_at", target = "create_at", qualifiedByName = "timestampToDate")
  Category categoryDTOToCategory(CategoryDTO categoryDTO);

  @Named("timestampToDate")
  default Date timestampToDate(Long timestamp) {
    return new Date(timestamp);
  }
  @Named("dateToTimestamp")
  default Long dateToTimestamp(Date date) {
    return date.getTime();
  }
}
