package ru.hse.student.storage.app.controller;

import java.util.List;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.hse.product.storage.api.StudentApi;
import ru.hse.product.storage.api.dto.*;
import ru.hse.product.storage.app.mapper.ProductMapper;
import ru.hse.product.storage.app.service.ProductService;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/product")
public class StudentController implements StudentApi {
  @Override
  public IdDTO createStudent(NewStudent newStudent) {
    return null;
  }

  @Override
  public List<Student> getStudentList() {
    return null;
  }
}
