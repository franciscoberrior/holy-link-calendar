package com.holy.calendar.infrastructure.output.adapter;

import com.holy.calendar.application.outputport.CreateEventOutputPort;
import com.holy.calendar.domain.model.Event;
import com.holy.calendar.infrastructure.output.mapper.EventMapper;
import com.holy.calendar.infrastructure.output.repository.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class CreateEvent implements CreateEventOutputPort {

  private final EventRepository eventRepository;

  @Override
  public Mono<Event> create(Event event) {
    return eventRepository.save(EventMapper.INSTANCE.toEntity(event))
        .map(EventMapper.INSTANCE::toModel);
  }
}
