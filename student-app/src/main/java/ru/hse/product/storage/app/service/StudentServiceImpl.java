package ru.hse.product.storage.app.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import ru.hse.product.storage.api.dto.IdDTO;
import ru.hse.product.storage.api.dto.NewStudent;
import ru.hse.product.storage.api.dto.Student;
import ru.hse.product.storage.app.dto.DetailedProduct;
import ru.hse.product.storage.app.dto.Product;
import ru.hse.product.storage.app.exception.ProductNotFoundById;
import ru.hse.product.storage.app.mapper.DetailedProductMapper;
import ru.hse.product.storage.app.mapper.ProductMapper;
import ru.hse.product.storage.data.api.repository.ProductRepository;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {
  @Override
  public IdDTO createStudent(NewStudent newStudent) {
    return null;
  }

  @Override
  public List<Student> getStudentList() {
    return null;
  }
}
