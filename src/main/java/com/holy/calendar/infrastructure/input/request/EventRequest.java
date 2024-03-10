package com.holy.calendar.infrastructure.input.request;

import java.time.LocalDate;
import java.time.LocalTime;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EventRequest {

  private String name;
  private LocalDate initDate;
  private LocalTime initTime;
  private LocalDate endDate;
  private LocalTime endTime;

}
