package com.holy.calendar.infrastructure.input.response;

import java.time.LocalDate;
import java.time.LocalTime;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EventResponse {

  private Long id;
  private String name;
  private LocalDate initDate;
  private LocalTime initTime;
  private LocalDate endDate;
  private LocalTime endTime;

}
