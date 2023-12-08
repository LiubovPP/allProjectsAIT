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
        //shop[0].setRam(24);
        // upper casting from Computer to Laptop, автоматически восходящее приведение
        shop[2] = new Laptop("i7", 24, 1024, "Asus", 4.5, 2.2);
        shop[3] = new Smartphone("Snapdragon", 8, 128, "Samsung", 24,
                0.15, 123456789098l);

        printArray(shop);

        Computer computer = new Computer("i5", 12, 512, "HP");
//        boolean checker = shop[0] == computer;
//        System.out.println(checker);
        boolean checker1 = shop[0].equals(computer);
        //Сравнивать объекты через "==" некорректно, т. к. "==" сравнивает формально ссылки, т. е. адреса объектов.
        //Для сравнения объектов в классе Object определен метод equals. Если хотим, чтобы объекты нашего класса
        //сравнивались между собой по нужным нам полям, то надо переопределить метод equals в нашем классе, указав
        //в нем логику сравнения заданного объекта с другим.
        System.out.println(checker1);
        checker1 = shop[3].equals(computer); // проверим смартфон false
        System.out.println(checker1);
        checker1 = shop[1].equals(shop[2]);
        System.out.println(checker1);
        Smartphone smartphone =new Smartphone("Snapdragon", 8, 128, "Samsung", 24,
                0.15, 1247901654);
        checker1= smartphone.equals(shop[3]);

    }

    public static void printArray(Computer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}