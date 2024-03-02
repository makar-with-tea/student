package ru.hse.student.storage.app.mapper;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentMapper {

  ru.hse.product.storage.api.dto.Student appDto2ApiDto(
      ru.hse.student.storage.app.dto.Student student);

  ru.hse.student.storage.app.dto.Student dataModel2AppDto(
      ru.hse.product.storage.data.api.model.Student student);
}
