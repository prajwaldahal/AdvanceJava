import java.sql.*;

public class CRUDOperations {
    private static final String URL = "jdbc:mysql://localhost:3306/testDB";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    public static void main(String[] args) {
        // Create a connection
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            // Create a table
            createTable(connection);

            // Insert a record
            int id = insertRecord(connection, "Ram krishna gopal", "ram@gmail.com");

            // Read records
            readRecords(connection);

            // Update a record
            updateRecord(connection, id, "Hari  Har", "HariHar@gmail.com");

            // Read records again
            readRecords(connection);

            // Delete a record
            deleteRecord(connection, id);

            // Read records again
            readRecords(connection);
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void createTable(Connection connection) throws SQLException {
        String query = "CREATE TABLE IF NOT EXISTS users (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(100), email VARCHAR(100))";
        try (Statement statement = connection.createStatement()) {
            statement.execute(query);
            System.out.println("Table created successfully.");
        }
    }

    private static int insertRecord(Connection connection, String name, String email) throws SQLException {
        String query = "INSERT INTO users (name, email) VALUES (?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
            statement.setString(1, name);
            statement.setString(2, email);
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            if (rs.next()) {
                int id = rs.getInt(1);
                System.out.println("Record inserted with ID: " + id);
                return id;
            }
        }
        return -1;
    }

    private static void readRecords(Connection connection) throws SQLException {
        String query = "SELECT * FROM users";
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
            }
        }
    }

    private static void updateRecord(Connection connection, int id, String name, String email) throws SQLException {
        String query = "UPDATE users SET name = ?, email = ? WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, name);
            statement.setString(2, email);
            statement.setInt(3, id);
            int rowsUpdated = statement.executeUpdate();
            System.out.println(rowsUpdated + " record(s) updated.");
        }
    }

    private static void deleteRecord(Connection connection, int id) throws SQLException {
        String query = "DELETE FROM users WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            int rowsDeleted = statement.executeUpdate();
            System.out.println(rowsDeleted + " record(s) deleted.");
        }
    }

   
}
