package hw_Lesson46.sportmen;

import java.util.ArrayList;
//Создайте приложение, которое позволит ввести в компьютер результаты спортсменов и получить итоговый протокол соревнования.

// надеюсь, правильно поняла задание?

public class SportmenAppl {
    public static void main(String[] args) {
        ArrayList<Sportmen> sportmenList = new ArrayList<>();

        sportmenList.add(new Sportmen("John", "Brown", 1, 2584, "Moscow"));
        sportmenList.add(new Sportmen("Denny", "Boon", 2, 2354, "Munich"));
        sportmenList.add(new Sportmen("Sergius", "Fuhrmann", 3, 1987, "Berlin"));
        sportmenList.add(new Sportmen("Christian", "Federl", 4, 3000, "Frankfurt"));
        sportmenList.add(new Sportmen("Marion", "Reischl", 5, 3145, "Madrid"));
        sportmenList.add(new Sportmen("Simon", "Carry", 6, 2984, "Alaska"));
        sportmenList.add(new Sportmen("Anna", "Tett", 7, 2700, "Victioria"));

        // напечатаем список

        for (Sportmen sp:sportmenList
             ) {
            System.out.println(sp);
        }
        System.out.println();


        // напечатаем протокол результатов

        for (Sportmen sp:sportmenList) {
            System.out.println(sp.getLastName());
            sp.displayTime();
        }
        System.out.println();


    }
}
