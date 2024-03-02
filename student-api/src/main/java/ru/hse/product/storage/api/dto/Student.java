package ru.hse.product.storage.api.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class Student {

  private Long id;
  private String name;

  private String surname;

  private String secondName;

  private String course;
}
