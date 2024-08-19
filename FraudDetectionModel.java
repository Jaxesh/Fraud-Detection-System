import java.util.List;

public class FraudDetectionModel {

    public void trainModel(List<Transaction> transactions) {
        // Placeholder for model training logic
        System.out.println("Training model with transaction data...");
    }

    public boolean predict(Transaction transaction) {
        // Placeholder for model prediction logic
        // This simple implementation flags transactions above a certain amount as fraudulent
        double fraudThreshold = 10000.0;
        return transaction.getAmount() > fraudThreshold;
    }
}
