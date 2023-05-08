package com.example.mapstructdemo.v1;

import org.mapstruct.Mapper;

@Mapper
public interface SimpleMapper {
  Destination sourceToDestination(Source source);
  Source destinationToSource(Destination destination);
}
