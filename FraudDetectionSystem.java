import java.util.List;

public class FraudDetectionSystem {

    public static void main(String[] args) {
        // Establish database connection
        DatabaseConnector dbConnector = new DatabaseConnector();
        dbConnector.connect();

        // Fetch transactions from the database
        List<Transaction> transactions = dbConnector.getTransactions();

        // Initialize the fraud detection model
        FraudDetectionModel model = new FraudDetectionModel();
        model.trainModel(transactions);

        // Predict and report fraudulent transactions
        for (Transaction transaction : transactions) {
            boolean isFraudulent = model.predict(transaction);
            if (isFraudulent) {
                System.out.println("Fraudulent transaction detected: " + transaction.toString());
            }
        }

        // Close the database connection
        dbConnector.disconnect();
    }
}
