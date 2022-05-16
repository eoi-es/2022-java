import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class MainPrepareStatementJDBC {

    public static void main(String... args) throws SQLException, IOException {
        final String url = "jdbc:mysql://127.0.0.1:3306/jdbc_test";
        final String user = "root";
        final String password = "1234";

        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println(String.format("[DEBUG] Already Connected to  %s", url));

        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the person's name");
        final String name = bufferedReader.readLine();
        System.out.println("Enter the person's age");
        final Integer age = Integer.parseInt(bufferedReader.readLine());

        final String sql = "SELECT * FROM CLIENT WHERE NAME LIKE ? AND AGE = ?";
        final PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, String.format("%s%%", name));
        statement.setInt(2, age);
        System.out.println(String.format("[DEBUG] Query %s", statement.toString()));

        final ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            System.out.println(String.format("DNI: %s", resultSet.getString("DNI")));
            System.out.println(String.format("Nombre: %s", resultSet.getString("NAME")));
            System.out.println(String.format("Edad: %d", resultSet.getInt("AGE")));
            System.out.println();

        }
        connection.close();
    }
}
