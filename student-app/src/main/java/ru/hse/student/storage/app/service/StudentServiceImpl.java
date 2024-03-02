package ru.hse.student.storage.app.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.hse.product.storage.api.dto.IdDTO;
import ru.hse.product.storage.api.dto.NewStudent;
import ru.hse.product.storage.data.api.repository.StudentRepository;
import ru.hse.student.storage.app.mapper.StudentMapper;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {
  private final StudentRepository studentRepository;
  private final StudentMapper studentMapper;
  @Override
  public IdDTO createStudent(NewStudent newStudent) {
    //return studentMapper.dataModel2AppDto(newStudent).getId();
    // мы запутались в типах
    return null;
  }
  // надо сделать mapper для id

  /*@Override
  public List<Student> getStudentList() {
    return null;
  }
   */
  // проблема с одинаковыми названиями типов?..
}
