package ru.hse.product.storage.data.repository;

import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import ru.hse.product.storage.api.dto.IdDTO;
import ru.hse.product.storage.api.dto.NewStudent;
import ru.hse.product.storage.data.api.model.Student;
import ru.hse.product.storage.data.api.repository.StudentRepository;

import java.util.List;
import java.util.UUID;

@Repository
@AllArgsConstructor
public class StudentRepositoryImpl implements StudentRepository {
    public static final RowMapper<Student> STUDENT_ROW_MAPPER =
            (rs, i) -> {
                Student student = new Student();


                student.setId(rs.getLong("id"));
                student.setName(rs.getString("name"));
                student.setSurname(rs.getString("surname"));
                student.setSecondName(rs.getString("secondName"));
                student.setCourse(rs.getString("course"));

                return student;
            };
    private final JdbcTemplate jdbcTemplate;

    @Override
    public Long createStudent(Student newStudent) {
        return jdbcTemplate.queryForObject(
                "insert into student(id, name, surname, secondName, course) "
                        + "values (uuid_generate_v4(), ?, ?, ?, ?) "
                        + "returning id",
                STUDENT_ROW_MAPPER,
                newStudent.getId()
        ).getId();// into student - в теории
    }

    @Override
    public List<Student> getStudentList() {
        return jdbcTemplate.query("select * from student",
                STUDENT_ROW_MAPPER);
    }
}
