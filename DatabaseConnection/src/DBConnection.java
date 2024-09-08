import java.sql.*;

public class DBConnection {
    public DBConnection() {
        String url = "jdbc:mysql://localhost:3307/cartlist";
        try {
            Connection c = DriverManager.getConnection(url,"root","");
            System.out.println("Connection Established");

            PreparedStatement preparedStatement=c.prepareStatement("select * from alex",
                    ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet resultSet=preparedStatement.executeQuery();
            while(resultSet.next()){
                System.out.println(resultSet.getInt(1));
            }
           resultSet.moveToInsertRow();
            resultSet.updateInt(1,23);
            resultSet.updateString(2,"hello");
            resultSet.updateInt(3,400);
            resultSet.updateInt(4,40);
            resultSet.insertRow();
            resultSet.moveToCurrentRow();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new DBConnection();
    }
}
