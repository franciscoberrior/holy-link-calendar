package com.holy.calendar.infrastructure.output.mapper;

import com.holy.calendar.domain.model.Event;
import com.holy.calendar.infrastructure.output.entity.EventEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = ComponentModel.SPRING)
public interface EventMapper {
  EventMapper INSTANCE = Mappers.getMapper(EventMapper.class);
  Event toModel(EventEntity event);
  EventEntity toEntity(Event event);
}
