package ru.hse.product.storage.api.dto;

import lombok.Data;

@Data
public class NewStudent {

  private String name;

  private String surname;

  private String secondName;

  private String course;
}
