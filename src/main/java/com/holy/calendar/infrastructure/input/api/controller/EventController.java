package com.holy.calendar.infrastructure.input.api.controller;

import com.holy.calendar.infrastructure.input.request.EventRequest;
import com.holy.calendar.infrastructure.input.response.EventResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Mono;

@RequestMapping("/event")
public interface EventController {

  @PostMapping
  Mono<EventResponse> create(EventRequest request);

}
