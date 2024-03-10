package com.holy.calendar.domain.model;

import java.time.LocalDate;
import java.time.LocalTime;

public record Event(
    Long id,
    String name,
    LocalDate initDate,
    LocalTime initTime,
    LocalDate endDate,
    LocalTime endTime) {

}
