//package currencyExchange;
//
//import java.io.*;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class CurrencyConverter {
//    private static final String CURRENCY_FILE = "src/Currency.csv";
//    private static final String TRANSACTION_FILE = "transactions.json";
//
//    private Map<String, Double> currencyRates;
//    private Map<String, Double> transactions;
//
//    public CurrencyConverter() {
//        this.currencyRates = loadCurrencyRates();
//        this.transactions = new HashMap<>();
//    }
//
//    private Map<String, Double> loadCurrencyRates() {
//        try {
//            BufferedReader reader = new BufferedReader(new FileReader(CURRENCY_FILE));
//            StringBuilder content = new StringBuilder();
//            String line;
//            while ((line = reader.readLine()) != null) {
//                content.append(line);
//            }
//            reader.close();
//
//            // Преобразование JSON в Map
//             return new Gson().fromJson(content.toString(), new TypeToken<HashMap<String, Double>>(){}.getType());
//        } catch (IOException e) {
//            e.printStackTrace();
//            return new HashMap<>();
//        }
//    }
//
//    private void saveTransaction(String fromCurrency, String toCurrency, double amount) {
//        transactions.putIfAbsent(fromCurrency, 0.0);
//        transactions.putIfAbsent(toCurrency, 0.0);
//
//        transactions.put(fromCurrency, transactions.get(fromCurrency) - amount);
//        transactions.put(toCurrency, transactions.get(toCurrency) + amount);
//
//        try {
//            BufferedWriter writer = new BufferedWriter(new FileWriter(TRANSACTION_FILE, true));
//            writer.write(fromCurrency + " -> " + toCurrency + ": " + amount + "\n");
//            writer.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    private double convertCurrency(double amount, String fromCurrency, String toCurrency) {
//        if (!currencyRates.containsKey(fromCurrency) || !currencyRates.containsKey(toCurrency)) {
//            throw new IllegalArgumentException("Неверные валюты");
//        }
//
//        double exchangeRate = currencyRates.get(toCurrency) / currencyRates.get(fromCurrency);
//        return amount * exchangeRate;
//    }
//
//    public void run() {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введите код вашей валюты: ");
//        String fromCurrency = scanner.nextLine().toUpperCase();
//
//        System.out.print("Введите код валюты для обмена: ");
//        String toCurrency = scanner.nextLine().toUpperCase();
//
//        System.out.print("Введите сумму для обмена: ");
//        double amount = scanner.nextDouble();
//
//        try {
//            double convertedAmount = convertCurrency(amount, fromCurrency, toCurrency);
//            System.out.printf("Сумма к выдаче: %.2f %s%n", convertedAmount, toCurrency);
//
//            saveTransaction(fromCurrency, toCurrency, amount);
//        } catch (IllegalArgumentException e) {
//            System.out.println("Ошибка: " + e.getMessage());
//        }
//    }
//
//    public static void main(String[] args) {
//        CurrencyConverter converter = new CurrencyConverter();
//        converter.run();
//    }
//}