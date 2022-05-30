package es.eoi.jdbc.repository;

import es.eoi.jdbc.entity.Student;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

abstract class AbstractRepository<E extends Serializable> {

    private final String url = "jdbc:mysql://127.0.0.1:3306/base";
    private final String user = "root";
    private final String password = "1234";

    private Connection connection;

    protected abstract E mapResultSet(ResultSet resultSet) throws SQLException;

    protected List<E> mapResultSetToCollection(ResultSet resultSet) throws SQLException {
        final List<E> collection = new ArrayList<E>();
        while (resultSet.next()) {
            collection.add(mapResultSet(resultSet));
        }
        return collection;
    }

    protected Connection getConnection() throws SQLException {
        if (connection == null) {
            this.connection = DriverManager.getConnection(url, user, password);
        }
        return this.connection;
    }

    protected void closeConnection() throws SQLException {
        this.connection.close();
        this.connection = null;
    }
}
