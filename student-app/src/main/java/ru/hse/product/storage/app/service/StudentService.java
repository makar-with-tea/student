package ru.hse.product.storage.app.service;

import ru.hse.product.storage.api.dto.IdDTO;
import ru.hse.product.storage.api.dto.NewStudent;
import ru.hse.product.storage.api.dto.Student;
import ru.hse.product.storage.app.dto.DetailedProduct;
import ru.hse.product.storage.app.dto.Product;

import java.util.List;
import java.util.UUID;

public interface StudentService {

  IdDTO createStudent(NewStudent newStudent);
  List<Student> getStudentList();
}
