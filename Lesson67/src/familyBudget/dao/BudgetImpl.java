package familyBudget.dao;

import familyBudget.model.Product;
import familyBudget.model.Purchase;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BudgetImpl implements Budget {
    List<Purchase> purchaseList;
    double budget;

    public BudgetImpl(List<Purchase> purchaseList, double budget) {
        this.purchaseList = new ArrayList<>(); // HashSet, TreeSet- тоже на подумать!!
        this.budget = budget;
    }

    @Override
    public boolean addPurchase(Purchase purchase) {
        // если бюджет позволяет
        // проверка на уникальность ? может быть такой чек был введен?
        return purchaseList.add(purchase);
    }

    @Override
    public double calcBudget() {
        return purchaseList.stream()
                .mapToDouble(Purchase::getTotalCost)
                .sum();
    }

    @Override
    public double budgetByPerson(String name) {
        return purchaseList.stream()
                .filter(purchase -> purchase.getPerson().equalsIgnoreCase(name))
                .mapToDouble(Purchase::getTotalCost).sum();
    }

    @Override
    public double budgetByStore(String store) {
        return purchaseList.stream()
                .filter(purchase -> purchase.getStore().equalsIgnoreCase(store))
                .mapToDouble(Purchase::getTotalCost).sum();
    }

    @Override
    public double budgetByPeriod(LocalDate from, LocalDate to) {
        return purchaseList.stream()
                .filter(purchase -> purchase.getDate().isAfter(from)&&purchase.getDate().isBefore(to))
                .mapToDouble(Purchase::getTotalCost).sum();
    }

    @Override
    public double addMoney(double money) {
        return budget+money;
    }

    @Override
    public boolean checkBudget(Purchase purchase) {

        return budget >= calcBudget();
    }

    @Override
    public double checkMoney(Purchase purchase) {
        return budget - calcBudget();
    }
}
