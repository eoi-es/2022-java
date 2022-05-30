package es.eoi.jdbc.repository;

import es.eoi.jdbc.entity.Student;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class StudentRepositoryImpl extends AbstractRepository<Student> implements StudentRepository {
    private final String ENTITY_NAME = "student";

    public Student findById(Integer id) throws SQLException {
        final PreparedStatement statement =
                super.getConnection().prepareStatement(String.format("SELECT * FROM %s WHERE id = ?;", ENTITY_NAME));
        statement.setInt(1, id);

        final ResultSet resultSet = statement.executeQuery();
        resultSet.next();
        final Student entity = mapResultSet(resultSet);
        closeConnection();
        return entity;
    }

    public List<Student> findAll() throws SQLException {
        final Statement statement = getConnection().prepareStatement("INSERT");
        final ResultSet resultSet = statement.executeQuery(String.format("SELECT * FROM %s;", ENTITY_NAME));
        final List<Student> entities = mapResultSetToCollection(resultSet);
        closeConnection();
        return entities;
    }

    public Integer create(Student student) throws SQLException {
        final PreparedStatement statement =
                getConnection().prepareStatement(
                        String.format("INSERT INTO %s (NAME,SURNAME,BIRTH_DATE) VALUES (?, ?, ?)", ENTITY_NAME),
                        Statement.RETURN_GENERATED_KEYS);
        statement.setString(1, student.getName());
        statement.setString(2, student.getSurname());
        statement.setDate(3, new java.sql.Date(student.getBirthDate().getTime()));
        int insertId = statement.executeUpdate();
        closeConnection();
        return insertId;
    }

    public boolean delete(String id) throws SQLException {
        // TODO
        return false;
    }

    public Integer update(Student student) throws SQLException {
        // TODO
        return null;
    }

    protected Student mapResultSet(ResultSet resultSet) throws SQLException {
        final Student entity = new Student();
        entity.setId(resultSet.getInt("id"));
        entity.setName(resultSet.getString("name"));
        entity.setSurname(resultSet.getString("surname"));
        entity.setBirthDate(resultSet.getDate("birth_date"));
        return entity;
    }

}
