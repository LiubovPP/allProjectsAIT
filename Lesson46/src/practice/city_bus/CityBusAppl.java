package practice.city_bus;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CityBusAppl {
    public static void main(String[] args) {
        // создать список городских маршрутов на основе автобусов из городского автопарка.
        //подсчитать общую вместимость автобусов из автопарка.
        List<Bus> cityBus = new ArrayList<>();
        cityBus.add(new Bus("Mersedes", "Num 1 ", "100", 30));
        cityBus.add(new Bus("Scania", "Num 2 ", "10A", 40));
        cityBus.add(new Bus("MANN", "Num 3 ", "10C", 25));
        cityBus.add(new Bus("Mersedes", "Num 4 ", "3", 35));
        cityBus.add(new Bus("Volvo", "Num 5 ", "100", 45));
        // создали
        Bus bus = new Bus("MANN", " num 6 ", "200", 90);
        // добавили в список
        cityBus.add(bus);

        System.out.println(cityBus.size());
        System.out.println("Is empty? " + cityBus.isEmpty());
        System.out.println(cityBus);// простая черновая печать
        System.out.println("-----------Unsorted List-----------------");

        // печать списка в столбик
        for (Bus b : cityBus  // для всех b тира Bus из списка cityBus делать:
        ) {
            System.out.println(b);
        }
        System.out.println();

        // сортировка
        cityBus.sort(Bus::compareTo);// произошла сортировка в памяти компа

        System.out.println("-----------Sorted List-----------------");
        // печать списка в столбик
        for (Bus b : cityBus  // для всех b тира Bus из списка cityBus делать:
        ) {
            System.out.println(b);
        }
        System.out.println();


        // считаем общую вместимость
        int totalCapacity = 0;
        for (Bus b : cityBus) {
            totalCapacity += b.getBusCapacity();
        }
        System.out.println("Total bus capacity " + totalCapacity);
        System.out.println();

        Comparator<Bus> comparator = new Comparator<Bus>() {
            @Override
            public int compare(Bus o1, Bus o2) {
                return o1.getBusCapacity() - o2.getBusCapacity();
            }
        };

        System.out.println("------------Sorted List by Capacity------------------ ");
        cityBus.sort(comparator);
        // печать списка в столбик
        for (Bus b : cityBus  // для всех b тира Bus из списка cityBus делать:
        ) {
            System.out.println(b);
        }
        System.out.println();
    }


}

