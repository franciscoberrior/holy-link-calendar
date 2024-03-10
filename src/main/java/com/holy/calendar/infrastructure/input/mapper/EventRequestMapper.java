package com.holy.calendar.infrastructure.input.mapper;

import com.holy.calendar.domain.model.Event;
import com.holy.calendar.infrastructure.input.request.EventRequest;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = ComponentModel.SPRING)
public interface EventRequestMapper {
  EventRequestMapper INSTANCE = Mappers.getMapper(EventRequestMapper.class);
  Event toModel(EventRequest request);
}
