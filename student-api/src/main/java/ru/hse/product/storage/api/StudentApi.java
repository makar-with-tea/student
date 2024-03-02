package ru.hse.product.storage.api;

import ru.hse.product.storage.api.dto.IdDTO;
import ru.hse.product.storage.api.dto.NewStudent;
import ru.hse.product.storage.api.dto.Student;

import java.util.List;

public interface StudentApi {
  IdDTO createStudent(NewStudent newStudent);
  List<Student> getStudentList();
  //void deleteProduct(UUID id);
}
