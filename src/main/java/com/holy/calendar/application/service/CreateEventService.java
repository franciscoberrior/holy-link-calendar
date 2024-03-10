package com.holy.calendar.application.service;

import com.holy.calendar.application.inputport.CreateEventServiceInputPort;
import com.holy.calendar.application.outputport.CreateEventOutputPort;
import com.holy.calendar.domain.model.Event;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class CreateEventService implements CreateEventServiceInputPort {

  private final CreateEventOutputPort createEvent;
  @Override
  public Mono<Event> createEvent(Event event) {
    return createEvent.create(event);
  }
}
