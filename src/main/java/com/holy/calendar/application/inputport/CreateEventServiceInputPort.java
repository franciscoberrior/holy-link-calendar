package com.holy.calendar.application.inputport;

import com.holy.calendar.domain.model.Event;
import reactor.core.publisher.Mono;

public interface CreateEventServiceInputPort {

  Mono<Event> createEvent(Event event);
}
