package ru.hse.student.storage.app.service;

import ru.hse.product.storage.api.dto.IdDTO;
import ru.hse.product.storage.api.dto.NewStudent;
import ru.hse.product.storage.api.dto.Student;

import java.util.List;

public interface StudentService {
  IdDTO createStudent(NewStudent newStudent);
  //List<Student> getStudentList();
}
