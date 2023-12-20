package pracrice.currencyExchange;

public enum CurrencyMenu {
    USD("USD"),
    EUR("EUR"),
    GBP("GBP"),
    JPY("JPY"),
    AUD("AUD"),
    CAD("CAD")
    ;
    private String name;

    CurrencyMenu(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public static void printMenu() {
        for (CurrencyMenu menu : CurrencyMenu.values()) {
            System.out.println(menu.getName());
        }
        System.out.println(); // new line
    }
    public static void exit (){
        System.exit(0);
    }
}
