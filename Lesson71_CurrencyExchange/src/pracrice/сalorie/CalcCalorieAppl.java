package pracrice.сalorie;

import pracrice.сalorie.dao.Calorie;
import pracrice.сalorie.dao.CalorieImpl;
import pracrice.сalorie.model.Menu;
import pracrice.сalorie.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CalcCalorieAppl {

    public static void main(String[] args) {
        CalorieImpl calorie = new CalorieImpl();
        List<Product> userProducts = calorie.loadFood();
        Scanner scanner = new Scanner(System.in);

        List<Product> userProduct = new ArrayList<>();

        boolean exit = false;
        while (!exit) {
            Menu.printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1: {
                    List<Product> libraryFood = calorie.readProductsFromCSV();// список продуктов
                    System.out.println("Input your food: ");
                    String food = scanner.nextLine().toUpperCase();
                    System.out.println("Input how many grams: ");
                    int gram = scanner.nextInt();
                    calorie.addProduct(libraryFood, userProduct,food,gram);
                    scanner.nextLine();
                    break;
                }
                case 2: {
                    userProduct.forEach(System.out::println);
                    // TODO No.1 Total calorie
                    break;
                }
                case 3:
                {
                    System.out.println("Input the product to remove:");
                    String productToRemove =scanner.nextLine().toUpperCase();
                    calorie.removeProduct(productToRemove);
                    System.out.println("The product is successfully removed");
                    break;}

                case 4: {
                    calorie.saveFood(userProduct);
                    break;
                }

                case 5: {
                    calorie.loadFood();
                    break;
                }
                case 6: {
                    exit = true;
                    break;
                }

                default:
                    System.out.println("Invalid choice. Please enter a valid menu option.");
            }


//        sumCal(userProduct);
//        sumCalMorning(userProduct);


        }
    }

}