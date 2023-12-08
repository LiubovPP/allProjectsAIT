package homework.сontainer;

import homework.сontainer.model.Box;
import homework.сontainer.model.Container;
import homework.сontainer.model.Parcel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

//Задание 1. Создайте класс Container с полями: String label (маркировка) и List - список коробок с посылками. Создайте
// класс Box с полем: List - список посылок. Классы Container и Box являются итерируемыми. Создайте класс Parcel
// (посылка) с полем double weight - вес посылки. Создайте класс ShipmentAppl с методом main. Задумайте случайное
// количество контейнеров (от 10 до 20). В каждом контейнере задумайте случайное количество коробок (от 10 до 20).
// В каждой коробке задумайте случайное количество посылок (от 5 до 10). Предположим, что каждая посылка в среднем имеет вес = 2 кг.
public class ContainerAppl {
    private static final int MIN_CONTAINERS = 10;
    private static final int MAX_CONTAINERS = 20;
    public static void main(String[] args) {

        Random random = new Random();
        // Создаем случайное количество контейнеров
        int containersNumber = random.nextInt(11) + 10;    // Генерируем случайное целое число в диапазоне от 10 до 20 включительно
        // или int containersNumber = new.Random().nextInt (MIN_CONTAINERS,MAX_CONTAINERS);
        List<Container> containers = new ArrayList<>();
        for (int i = 0; i < containersNumber; i++) {
            containers.add(new Container("Container - "+i));
        }
               //Задание 2. Подсчитайте общее количество посылок во всех ящиках и их общий вес.

        int totalParcels = 0;
        double totalWeight = 0.0;

        for (Container container : containers) { // перебираем каждый контейнер
            for (Box box : container) { // перебираем каждую коробку в контейнере
                for (Parcel parcel : box) { // перебираем каждую посылку в коробке
                    totalParcels++; // подсчет посылок
                    totalWeight += parcel.getWeight(); // подсчет веса посылок
                }
            }
        }
        System.out.println("Общий вес посылок: " + totalWeight);
        System.out.println("Общее количество посылок: " + totalParcels);

// Задание 2: Подсчитываем общее количество посылок и их общий вес с помощью StreamAPI
//         int totalParcels = containers.stream()
//                 .flatMap(Container::getBoxList)
//                 .flatMap(Box::getParcels)
//                         .mapToInt(parcel -> 1).sum();
//        System.out.println("Общее количество посылок: " + totalParcels);
//        int totalWeight = containers.stream()
//                .flatMap(Container::getBoxList)
//                .flatMap(Box::getParcels)
//                .mapToDouble(Parcel::getWeight)
//                .sum();
//        System.out.println("Общий вес посылок: " + totalWeight);

        // Задание 3: Находим label контейнера с максимальным количеством посылок
        int maxParcelCount = 0;
        String containerWithMaxParcels = "";

        for (Container container : containers) {
            int currentParcelCount = 0;

            for (Box box : container) {
                currentParcelCount += ((List<?>) box).size();
            }

            if (currentParcelCount > maxParcelCount) {
                maxParcelCount = currentParcelCount;
                containerWithMaxParcels = container.getLabel();
            }
        }
        // со StreamAPI
//        String containerWithMaxParcels = containers.stream()
//                .max((c1, c2) -> (int) (c1.boxStream().flatMap(Box::parcelStream).count()
//                        - c2.boxStream().flatMap(Box::parcelStream).count()))
//                .map(Container::getLabel)
//                .orElse("");
//
//        System.out.println("\nЗадание 3:");
//        System.out.println("Label контейнера с максимальным количеством посылок: " + containerWithMaxParcels);




        System.out.println("\nЗадание 3:");
        System.out.println("Label контейнера с максимальным количеством посылок: " + containerWithMaxParcels);

        // Задание 4: Находим все контейнеры с максимальным количеством посылок
        List<Container> containersWithMaxParcels = new ArrayList<>();

        for (Container container : containers) {
            int currentParcelCount = 0;

            for (Box box : container) {
                currentParcelCount += ((List<?>) box).size();
            }

            if (currentParcelCount == maxParcelCount) {
                containersWithMaxParcels.add(container);
            }
        }

// со StreamAPI
//        System.out.println("\nЗадание 4:");
//        System.out.println("Контейнеры с максимальным количеством посылок:");
//        for (Container container : containersWithMaxParcels) {
//            System.out.println(container.getLabel());
//        }
//        // Задание 4: Находим все контейнеры с максимальным количеством посылок
//        List<Container> containersWithMaxParcels = containers.stream()
//                .filter(container -> container.boxStream().flatMap(Box::parcelStream).count() ==
//                        containers.stream().mapToLong(c -> c.boxStream().flatMap(Box::parcelStream).count()).max().orElse(0))
//                .collect(Collectors.toList());
//
//        System.out.println("\nЗадание 4:");
//        System.out.println("Контейнеры с максимальным количеством посылок:");
//        containersWithMaxParcels.forEach(container -> System.out.println(container.getLabel()));
    }


    // еще варианты:
    //public static void main(String[] args) {
    //    Random random = new Random();
    //    int numContainers = random.nextInt(10,21); // От 10 до 20 контейнеров
    //
    //
    //    List<Container> containers = Stream.generate(() ->
    //                    new Container("Wakanda" , random.nextInt(10,21)))
    //            .limit(numContainers)
    //            .collect(Collectors.toList());
    //
    //    List<Integer> contNumbers = IntStream.rangeClosed(1, numContainers)
    //            .boxed()
    //            .collect(Collectors.toList());
    //
    //    IntStream.range(0, numContainers).forEach(index -> {
    //        Container container = containers.get(index);
    //        System.out.println("Container " + contNumbers.get(index) + " : " + container.label);
    //        container.boxes.forEach(box -> {
    //            System.out.println("  Box with " + box.parcels.size() + " parcels");
    //            box.parcels.forEach(parcel ->
    //                    System.out.println("    Parcel with weight: " + parcel.weight + " kg"));
    //        });
    //        System.out.println();
    //    });
    //
    //    int totalParcels = containers.stream()
    //            .mapToInt(Container::getTotalParcels)
    //            .sum();
    //
    //    double totalWeight = containers.stream()
    //            .flatMap(container -> container.boxes.stream())
    //            .flatMap(box -> box.parcels.stream())
    //            .mapToDouble(parcel -> parcel.weight)
    //            .sum();
    //
    //    System.out.println("Total parcels: " + totalParcels);
    //    System.out.println("Total weight: " + totalWeight + " kg");
    //
    //    int maxParcels = containers.stream()
    //            .mapToInt(Container::getTotalParcels)
    //            .max()
    //            .orElse(0);
    //    System.out.println("Max parcel in Container = " + maxParcels);
    //    System.out.println();
    //    System.out.println("Containers with the maximum number of parcels:");
    //    containers.stream()
    //            .filter(container -> container.getTotalParcels()==maxParcels)
    //            .forEach(System.out::println);
    //
    //}
}
