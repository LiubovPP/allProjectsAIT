package hwLesson19.product;

import hwLesson19.product.model.Food; /// О! тут само все импортировалось
import hwLesson19.product.model.MeatFood;
import hwLesson19.product.model.MilkFood;
import hwLesson19.product.model.Product;

//Создать класс ProductAppl c методом main. В методе main создать массив в котором хранятся по одному объекту для
//каждого продукта. Создать метод печатающий все продукты из массива, и метод возвращающий сумму цен всех продуктов.
public class ProductAppl {
    public static void main(String[] args) {
        Product[] product = new Product[4];
        product[0] = new Product("Non-food", 548421, 40);//
        product[1] = new Food("Food", 174893, 154, "15.12.2025");
        product[2] = new MeatFood("MeatFood", 1648545, 158, "25.07.2024", "Beaf");
        product[3] = new MilkFood("MilkFood", 478764513, 78, "07.09.2023",
                "Sour cream", 20);

        for (int i = 0; i < product.length; i++) {
            System.out.println(product[i]);
        }
        System.out.println();
        int sumPrice = 0;
        for (int i = 0; i < product.length; i++) {
            sumPrice += product[i].getPrice();
        }
        System.out.println("The total price of all products is " + sumPrice);
    }
}
