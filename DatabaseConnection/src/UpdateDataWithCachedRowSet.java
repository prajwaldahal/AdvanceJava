import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UpdateDataWithCachedRowSet {
    public static void main(String[] args) {
        Connection conn = null;
        try {
            // Establish a database connection
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/cartlist", "root", "");
            conn.setAutoCommit(false);

            // Create a CachedRowSet
            CachedRowSet rowSet = RowSetProvider.newFactory().createCachedRowSet();

            // Set the connection for the CachedRowSet
            rowSet.setUrl("jdbc:mysql://localhost:3307/cartlist");
            rowSet.setUsername("root");
            rowSet.setPassword("");

            // Execute a query and populate the CachedRowSet
            rowSet.setCommand("SELECT * FROM alex");
            rowSet.execute();

            // Work with the data (e.g., modify rows)
            while (rowSet.next()) {
                int id = rowSet.getInt("id");
                String name = rowSet.getString("name");

                // Modify the data (e.g., change the name)
                if (name != null) {
                    rowSet.updateString("name", name.toUpperCase()); // Update the 'name' column
                    rowSet.updateRow(); // Commit the update to the row
                }
            }

            // Accept changes and update the database
            rowSet.acceptChanges(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close the connection in a finally block to ensure it's closed even in case of exceptions
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
