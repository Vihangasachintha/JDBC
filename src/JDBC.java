import java.sql.*;

public class JDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String password = "Viha@sachi2002";
        String query = "CREATE TABLE subjects (code VARCHAR(20),name VARCHAR(20))";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, user, password);

            Statement statement = connection.createStatement();
            statement.executeUpdate(query);

            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
