package pracrice.currencyExchange;

public class Transaction {
    private String currencyCode;
    private double amount;
    private double result;

    public String getCurrencyCode() {
        return currencyCode;
    }

    public double getAmount() {
        return amount;
    }

    public double getResult() {
        return result;
    }

    public Transaction(String currencyCode, double amount, double result) {
        this.currencyCode = currencyCode;
        this.amount = amount;
        this.result = result;
    }
}
