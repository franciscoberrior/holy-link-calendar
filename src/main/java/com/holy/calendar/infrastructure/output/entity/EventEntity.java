package com.holy.calendar.infrastructure.output.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@Table(name = "EVENT")
public class EventEntity {

  @Id
  private Long id;
  private String name;
  private LocalDate initDate;
  private LocalTime initTime;
  private LocalDate endDate;
  private LocalTime endTime;

}
