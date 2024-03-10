package com.holy.calendar.infrastructure.input.mapper;

import com.holy.calendar.domain.model.Event;
import com.holy.calendar.infrastructure.input.response.EventResponse;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = ComponentModel.SPRING)
public interface EventResponseMapper {
  EventResponseMapper INSTANCE = Mappers.getMapper(EventResponseMapper.class);
  EventResponse toResponse(Event event);
}
