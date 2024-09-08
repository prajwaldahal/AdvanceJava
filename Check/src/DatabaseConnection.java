import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
        public DatabaseConnection() {
            String url = "jdbc:mysql://localhost:3307/mysql";
            try {
                Connection c = DriverManager.getConnection(url,"root","");
                System.out.println("Connection Established");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        public static void main(String[] args) {
            new DatabaseConnection();
        }
    }
