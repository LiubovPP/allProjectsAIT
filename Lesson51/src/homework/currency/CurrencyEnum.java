package homework.currency;
// Задача 3. Создайте enum с кодами валют и их текущими курсами к евро. Убедитесь, что в списке нет дублирующихся кодов
// валют. Выведите список валют и их курсов на экран. Реализуйте возможность для пользователя выбрать желаемую валюту,
// ввести ее количество и узнать, сколько он получит при обмене на евро.
public enum CurrencyEnum {

    ONE (1.00, "Euro"), TWO (1.10, "Dollar"),
    THREE (96.61, "Ruble"), FOUR (0.87, "GBP");
    private double currencyCode;
    private String currency;

    CurrencyEnum(double currencyCode, String currency) {
        this.currencyCode = currencyCode;
        this.currency = currency;
    }

    public double getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(double currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
