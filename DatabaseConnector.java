import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DatabaseConnector {

    private Connection connection;

    public void connect() {
        try {
            // Establish connection to the database
            String url = "jdbc:mysql://localhost:3306/fraud_detection";
            String username = "root";
            String password = "password";
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Transaction> getTransactions() {
        List<Transaction> transactions = new ArrayList<>();
        try {
            // Query the database for transactions
            String query = "SELECT * FROM transactions";
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                Transaction transaction = new Transaction(
                    rs.getInt("id"),
                    rs.getDouble("amount"),
                    rs.getString("date"),
                    rs.getString("account_number")
                );
                transactions.add(transaction);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return transactions;
    }

    public void disconnect() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Disconnected from the database.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
