package com.holy.calendar.infrastructure.output.repository;

import com.holy.calendar.infrastructure.output.entity.EventEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface EventRepository extends ReactiveCrudRepository<EventEntity, Long> {

}
