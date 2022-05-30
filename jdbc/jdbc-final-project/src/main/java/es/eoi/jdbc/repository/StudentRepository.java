package es.eoi.jdbc.repository;

import es.eoi.jdbc.entity.Student;

import java.sql.SQLException;
import java.util.List;

public interface StudentRepository {

    Student findById(Integer id) throws SQLException;

    List<Student> findAll() throws SQLException;

    Integer create(Student student) throws SQLException;

    boolean delete(String id) throws SQLException;

    Integer update(Student student) throws SQLException;

}
