package familyBudget;

import familyBudget.dao.BudgetImpl;
import familyBudget.model.Menu;
import familyBudget.model.Product;
import familyBudget.model.Purchase;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BudgetAppl {
    public static void main(String[] args) {
        List<Purchase> purchaseList = new ArrayList<>();
        List<Product> productList = new ArrayList<>();
        BudgetImpl budget = new BudgetImpl(purchaseList, 0);
        LocalDate now = LocalDate.now();

        while (true) {
            Menu.printMenu();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input your choice: ");
            int choice = scanner.nextInt();


            switch (choice) {
                case 1: {
                    System.out.println("Input budget amount: ");
                    double b = scanner.nextDouble();
                    // ??
                    break;
                }
                case 2: {
                    // load datd
                    // print
                    break;
                }
                case 3: {
                    System.out.println("Purchases by stores: ");
                    // вызвать метод и распечатать
                    // print
                    break;
                }
                case 4: {
                    System.out.println("Purchases by person: ");
                    // вызвать метод и распечатать
                    // print
                    break;
                }
                case 5: {
                    System.out.println("Purchases by period: ");
                    // вызвать метод и распечатать
                    // print
                    break;
                }
                case 6: {
                    System.out.println("Input purchase amount: ");
                    // вызвать метод и распечатать
                    // print
                    break;
                }
                case 7: {
                    return;
                }
                default: {
                    System.out.println("Wrong choice");
                }
            }}}}


