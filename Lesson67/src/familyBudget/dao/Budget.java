package familyBudget.dao;

import familyBudget.model.Product;
import familyBudget.model.Purchase;

import java.time.LocalDate;

public interface Budget {
    boolean addPurchase(Purchase purcahse);
    double calcBudget();
    double budgetByPerson(String name);
    double budgetByStore(String store);
    double budgetByPeriod(LocalDate from, LocalDate to);
    double addMoney(double money);
    boolean checkBudget(Purchase purchase); // yes or no
    double checkMoney (Purchase purchase);
}
