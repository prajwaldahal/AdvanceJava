
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConnection {
    public DatabaseConnection(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver"); 
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3307/mysql","root","");
            System.out.println("Connection established");
        } catch (Exception ex) { 
            System.out.println(ex);
        }
       
    }
    public static void main(String[] args) {
        new DBConnection();
    }
}
