package com.holy.calendar.application.outputport;

import com.holy.calendar.domain.model.Event;
import reactor.core.publisher.Mono;

public interface CreateEventOutputPort {

  Mono<Event> create(Event event);
}
