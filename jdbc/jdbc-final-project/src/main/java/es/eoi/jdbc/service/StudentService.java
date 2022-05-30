package es.eoi.jdbc.service;

import es.eoi.jdbc.entity.Student;
import es.eoi.jdbc.repository.StudentRepository;
import es.eoi.jdbc.repository.StudentRepositoryImpl;

import java.sql.SQLException;
import java.util.List;

public class StudentService {

    private final StudentRepository repository;

    public StudentService() {
        this.repository = new StudentRepositoryImpl();
    }

    public Student findById(Integer id) {
        try {
            return this.repository.findById(id);
        } catch (SQLException e) {
            throw new RuntimeException(String.format("Error trying to find student %d", id), e.getCause());
        }
    }

    public List<Student> findAll() {
        try {
            return this.repository.findAll();
        } catch (SQLException e) {
            throw new RuntimeException("Error trying get all students", e.getCause());
        }
    }

    public Student create(Student student) {
        if (student.getId() != null) {
            throw new RuntimeException(String.format("Student ID has to be null, but it is %d", student.getId()));
        }
        try {
            final Integer id = this.repository.create(student);
            return this.findById(id);
        } catch (SQLException e) {
            throw new RuntimeException("Error trying create student", e.getCause());
        }
    }

    public boolean delete(String id) {
        try {
            return this.repository.delete(id);
        } catch (SQLException e) {
            throw new RuntimeException(String.format("Error trying to delete student %d", id), e.getCause());
        }
    }

    public Student update(Student student) {
        if (student.getId() == null) {
            throw new RuntimeException("Student ID has to be set but it is null");
        }
        try {
            final Integer id = this.repository.update(student);
            return this.findById(id);
        } catch (SQLException e) {
            throw new RuntimeException("Error trying save student", e.getCause());
        }
    }
}
