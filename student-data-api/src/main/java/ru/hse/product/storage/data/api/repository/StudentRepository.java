package ru.hse.product.storage.data.api.repository;



import ru.hse.product.storage.data.api.model.Student;

import java.util.List;

public interface StudentRepository {
    Long createStudent(Student newStudent);
    List<Student> getStudentList();
}
