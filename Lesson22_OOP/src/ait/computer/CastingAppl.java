package ait.computer;

import ait.computer.model.Computer;
import ait.computer.model.Laptop;
import ait.computer.model.Smartphone;

public class CastingAppl {
    public static void main(String[] args) {
        Computer lap1 = new Laptop("i7", 16, 512, "Asus", 3, 2.1);
        System.out.println(lap1);
        if (lap1 instanceof Laptop){
            Laptop laptop1= (Laptop) lap1; // down casting, нисходящее приведение
            laptop1.setHours(4.5);
            System.out.println (laptop1);
        }Computer smart1 = new Smartphone("Snapdragon", 8, 128, "Samsung", 24,
                0.15, 123456789098l);
        if (smart1 instanceof Smartphone) {

        Smartphone smartphone1= (Smartphone) smart1;
        System.out.println(smartphone1.getImei());}
        if (lap1 instanceof Smartphone){
            Smartphone smartphone2= (Smartphone) lap1;
            System.out.println(smartphone2);
        }else {
            System.out.println("lap1 is not a Smartphone");
        }

    }
}
