package ru.hse.student.storage.app.dto;

import lombok.Data;

@Data
public class Student {

  private Long id;
  private String name;

  private String surname;

  private String secondName;

  private String course;
}
