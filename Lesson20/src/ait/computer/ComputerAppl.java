package ait.computer;

import ait.computer.model.Computer;
import ait.computer.model.Laptop;
import ait.computer.model.Smartphone;

public class ComputerAppl {
    public static void main(String[] args) {
        double a = 10;
        int[] arr = new int[10];
        System.out.println(arr);
        Computer[] shop = new Computer[5];
        System.out.println(shop);
        shop[0] = new Computer("i5", 12, 512, "HP");
        shop[1] = new Laptop("i7", 16, 512, "Asus", 3, 2.1);
        shop[0].setRam(24);
        // upper casting from Computer to Laptop, автоматически восходящее приведение
        shop[2] = new Laptop("i7", 24, 1024, "Asus", 3, 2.1);
        shop[3] = new Smartphone("Snapdragon", 8, 128, "Samsung", 24,
                0.15, 123456789098l);

        printArray(shop);
        int total = getTotalSSDCapacity(shop);
        System.out.println("Total SSD capacity = " + total);
        Laptop laptop1 = (Laptop) shop[1]; // down casting, нисходящее приведение
        laptop1.setHours(4.5);
        System.out.println(laptop1);
        System.out.println(shop[1]);
        double res = getTotalLaptopHours(shop);
        System.out.println("Total laptops hours = " + res);
        total = getTotalSSDLaptopCapacity(shop);
        System.out.println("Total ssd laptops capacity = " + total);
    }
//        Object computer = new Computer("i5", 12, 512, "HP");
//        Object laptop = new Laptop("i7", 16, 512, "Asus", 3, 2.1);
//        System.out.println(computer);
//        System.out.println(laptop);

    //Задача 1. В классе ComputerAppl из классной работы, добавить метод возвращающий общее время работы батарей всех
//Laptop. В main распечатать результат работы этого метода.
    public static double getTotalLaptopHours(Computer[] arr) {


            double res = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] instanceof Laptop) {
                    Laptop laptop = (Laptop) arr[i];
                    res += laptop.getHours();
                }
            }
        return res;
        }



//    public static double getTotalLaptopHours(Computer[] arr) {
//        double res = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] instanceof Laptop) {
//                Laptop laptop = (Laptop) arr[i];
//                res += laptop.getHours(); // res = res + laptop.getHours();
//            }
//        }
//        return res;
//    }

    //Задача 2.В классе ComputerAppl из классной работы, добавить метод возвращающий общий объем ssd дисков всех Laptop.
    //Обратите внимание, что емкость диска смартфонов считаться не должна. В main распечатать результат работы
    //этого метода.
    public static int getTotalSSDLaptopCapacity(Computer[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Laptop && !(arr[i] instanceof Smartphone)) {
                res += arr[i].getSsd(); // res = res + arr[i].getSsd();
            }
        }
        return res;
    }


    public static void printArray(Computer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int getTotalSSDCapacity(Computer[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                res += arr[i].getSsd(); // res=res + arr[i].getSsd();
            }

        }
        return res;
    }
}