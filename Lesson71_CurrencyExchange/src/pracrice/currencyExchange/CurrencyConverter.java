package pracrice.currencyExchange;

import java.io.*;
import java.math.BigDecimal;
import java.util.*;

//конвертор валюты:
//
//загружает из файла список доступных валют с курсами (список валют - это множество!);
//запрашивает у клиента желаемую валюту и сколько у него денег для обмена;
//сообщает сумму к выдаче;
//в конце сеанса сохраняет все сделанные транзакции в файл, предоставляет отчет о сумме обменов по каждой валюте
// отдельно по покупке и продаже.
public class CurrencyConverter {
    private static final String FILE_PATH = "Lesson71_CurrencyExchange/src/pracrice/currencyExchange/Currency1.csv";
    private static final String FILE_TRANSACTION_PATH = "Lesson71_CurrencyExchange/src/pracrice/currencyExchange/CurrencyTransactionCreated";

    private static Map<String, Double> exchangeRatesMap = new HashMap<>();
    private static List<String> currencyCodesList = new ArrayList<>();


    public static void main(String[] args) {
        loadExchangeRates();
        System.out.println("Welcome to Currency Exchange Application");
        while (true) {
            for (int i = 0; i < currencyCodesList.size(); i++) {
                String currencyCode = currencyCodesList.get(i);
                System.out.println((i + 1) + " - " + currencyCode);
            }
            Scanner scanner = new Scanner(System.in);
            System.out.println("Select a number of currency convercion: ");
            try {
                int choice = scanner.nextInt();
                String currentCurrencyCode = currencyCodesList.get(choice - 1);
                BigDecimal rate = BigDecimal.valueOf(exchangeRatesMap.get(currentCurrencyCode)); // достаем по ключу курс валюты
                System.out.println(" rate" + rate);
                System.out.println("How many would you like to change? ");
                BigDecimal amount = scanner.nextBigDecimal(); // работает точнее с точками
                BigDecimal res = amount.multiply(rate);
                System.out.println(res);
                Transaction transaction = new Transaction(currentCurrencyCode, amount.doubleValue(), res.doubleValue());

                saveTransaction(transaction);
            } catch (Exception e) {
                System.out.println("Wrong input");
            }


        }
    }

    private static void saveTransaction(Transaction transaction) { // записываем в файл
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_TRANSACTION_PATH, true))) {
            writer.printf("Currency: %s, Amount: %.2f, Result: %2f\n",
                    transaction.getCurrencyCode(), transaction.getAmount(), transaction.getResult());

            System.out.println("Transaction saved into the file " + FILE_TRANSACTION_PATH);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void loadExchangeRates() { // считываем с файла
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(";");
                if ((parts.length == 2)) {
                    String currencyCode = parts[0];
                    double exchangeRate = Double.parseDouble(parts[1]);
                    exchangeRatesMap.put(currencyCode, exchangeRate);
                    currencyCodesList.add(currencyCode);
                }
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
