package com.holy.calendar.infrastructure.input.api.impl;

import com.holy.calendar.application.inputport.CreateEventServiceInputPort;
import com.holy.calendar.infrastructure.input.api.controller.EventController;
import com.holy.calendar.infrastructure.input.mapper.EventRequestMapper;
import com.holy.calendar.infrastructure.input.mapper.EventResponseMapper;
import com.holy.calendar.infrastructure.input.request.EventRequest;
import com.holy.calendar.infrastructure.input.response.EventResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
public class EventControllerImpl implements EventController {

  private final CreateEventServiceInputPort createEventService;

  @Override
  public Mono<EventResponse> create(EventRequest request) {
    return
        createEventService.createEvent(EventRequestMapper.INSTANCE.toModel(request))
            .map(EventResponseMapper.INSTANCE::toResponse);
  }
}
