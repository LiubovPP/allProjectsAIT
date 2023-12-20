package pracrice.сalorie.dao;

import pracrice.сalorie.model.Product;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CalorieImpl implements Calorie {
    private List<Product> products;
    private LocalDate date; // TODO No.2

    public CalorieImpl() {
        this.products = products;
        this.date = date;
    }

    public List<Product> readProductsFromCSV() {
        List<Product> productList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("Lesson71_CurrencyExchange/src/pracrice/сalorie/Product.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(";");
                if (data.length == 2) {
                    String name = data[0].toUpperCase();
                    int calories = Integer.parseInt(data[1]);

                    productList.add(new Product(name, calories));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        productList.forEach(System.out::println); // todo убрать

        return productList;
    }

    @Override
    public void saveFood(List<Product> products) {
        String filePath = "Lesson71_CurrencyExchange/src/pracrice/сalorie/saved_food.txt";

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(products);
            System.out.println("\nЕда сохранена.");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Product> loadFood() { // TODO test
        List<Product> loadedProducts = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Lesson71_CurrencyExchange/src/pracrice/сalorie/saved_food.txt"))) {
            loadedProducts = (List<Product>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return loadedProducts;
    }

    @Override
    public void addProduct(List<Product> libraryFood, List<Product> userProducts, String food, int gram) {

        for (Product product : libraryFood) {
            if (food.equalsIgnoreCase(product.getName())) {
               int userGram = (product.getCalorie() * gram) / 100;
                userProducts.add(new Product(food, userGram));
                System.out.println("Product added successfully!");
            }
        }
        System.out.println("Product not found in the library.");
    }

    @Override
    public boolean removeProduct(String product) {
        products.removeIf(product1 -> product1.getName().equalsIgnoreCase(product));
        return true;
    }


    public List<Product> getProducts() {
        return products;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CalorieImpl calorie = (CalorieImpl) o;
        return Objects.equals(date, calorie.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date);
    }

    @Override
    public String toString() {
        return "CalorieImpl{" +
                "products=" + products +
                ", date=" + date +
                '}';
    }

    //  PrintWriter pw = new PrintWriter(new FileWriter(str, true)); // поставили флаг - добавление это true(позволяет дополнять, а не перезаписывать файл) / создаем поток символов в файл
    //        System.out.println("Type the text here ");
    //        str = br.readLine();
    //        while (!"stop".equalsIgnoreCase(str)){ // пока строка не равна STOP будем продолжать цикл
    //            pw.println(str);
    //            System.out.println("Type the text here ");
    //            str = br.readLine();
    //        }
    //        pw.flush();// отправление из буфера в поток => файл
    //        pw.close(); // закрываем файл
}
