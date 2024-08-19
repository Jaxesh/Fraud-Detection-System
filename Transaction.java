public class Transaction {

    private int id;
    private double amount;
    private String date;
    private String accountNumber;

    public Transaction(int id, double amount, String date, String accountNumber) {
        this.id = id;
        this.amount = amount;
        this.date = date;
        this.accountNumber = accountNumber;
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public String getDate() {
        return date;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString() {
        return "Transaction [id=" + id + ", amount=" + amount + ", date=" + date + ", accountNumber=" + accountNumber + "]";
    }
}
