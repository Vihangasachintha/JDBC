import java.sql.*;

public class JDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String password = "Viha@sachi2002";
        String query = "SELECT * from users";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, user, password);

            Statement statement = connection.createStatement();
            statement.executeQuery(query);

            ResultSet resultSet = statement.executeQuery(query);

            String name;
            int age;
            while (resultSet.next()) {
                name = resultSet.getString(1);
                age = resultSet.getInt(2);
                System.out.println(name + " " + age);
            }

            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
