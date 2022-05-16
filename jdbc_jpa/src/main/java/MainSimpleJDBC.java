import java.sql.*;

public class MainSimpleJDBC {

    public static void main(String... args) throws SQLException {
        final String url = "jdbc:mysql://127.0.0.1:3306/jdbc_test";
        final String user = "root";
        final String password = "1234";

        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println(String.format("Already Connected to  %s", url));

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM CLIENT");
        while (resultSet.next()) {
            System.out.println(String.format("DNI: %s", resultSet.getString("DNI")));
            System.out.println(String.format("Nombre: %s", resultSet.getString("NAME")));
            System.out.println(String.format("Edad: %d", resultSet.getInt("AGE")));
            System.out.println();

        }
        connection.close();
    }
}
