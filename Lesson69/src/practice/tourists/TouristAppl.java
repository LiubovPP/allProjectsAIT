package practice.tourists;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class TouristAppl {
    public static void main(String[] args) {
        // Задание 2. Турагентство специализируется на странах Средиземноморья - Испания, Франция, Италия, Греция, Турция, Тунис. Имеется таблица с данными о поездках клиентов в течение 2020-2023 годов в перечисленные страны. Каждый из клиентов посетил от одной до 3 стран, причем некоторые страны по 2 и более раз. Необходимо ответить на вопросы:
        //Какие страны наиболее популярны?
        //Кто из клиентов посетил наибольшее количество стран?
        List<Tourist> tourists = getTourists(); // заполняем список туристов
        System.out.println("-----------Most skilled tourists----------------");
        printSkilledTourist(tourists);
        System.out.println("----------------------------------------");

        printVisitedCountries(tourists);

    }// end of main

    private static void printVisitedCountries(List<Tourist> tourists) {
        System.out.println("--------------Print all countries---------");
        Iterable<String> technologies =tourists.stream().map(programmer -> programmer.getCountryVisited())// преобразование объкта programmer в одно его поле с массивом технологий
                .flatMap(strings -> Arrays.stream(strings)) // каждый из массивов преобразуем в отдельный stream
                .collect(Collectors.toList()); // собираем результат стримов в лист
        // technologies.forEach(System.out::println);
        System.out.println("----------List of countries-------------");
        StreamSupport.stream(technologies.spliterator(), false)
                .distinct() // убрали дубликаты
                .forEach(System.out::println);
        System.out.println("----------Grouping By tourists---------");
        Map <String, Long>  countryFrequency=tourists.stream()
                .map(Tourist::getCountryVisited)
                .flatMap(Arrays::stream)
                .collect(Collectors.groupingBy(t-> t, Collectors.counting()));
        System.out.println(countryFrequency);
        System.out.println("-----------Most popular countries ----------------");
        Long max = countryFrequency.values().stream().max(Long::compare)
                .orElse(0L);

        countryFrequency.entrySet().stream().filter(e-> max.equals(e.getValue())).forEach(e-> System.out.println(e.getKey()));
    }

    private static void printSkilledTourist(List<Tourist> tourists) {
        // Integer сколько раз встретилась страна, список стран
        Map<Integer, List<Tourist>> skilledTourists = tourists.stream()
                .collect(Collectors.groupingBy(programmer -> programmer.getCountryVisited().length));
        Integer max = skilledTourists.keySet().stream().max(Integer::compareTo).orElse(0);
       skilledTourists.get(max).forEach(System.out::println);
    }


    private static List<Tourist> getTourists() {
            return List.of(
                                        new Tourist("Olesia", "Iran", "Kyrgystan", "United Arab Emirates", "France", "Italy", "Portugal", "Spain"),
                    new Tourist("Bilbo Baggins","Italy","Spain", "Turkey"),
                    new Tourist("Tatyana", "Italy", "Spain", "Italy", "Greece", "Turkey"),
                    new Tourist("Anton", "Germany", "Nederland", "Turkey", "Georgia"),
                    new Tourist("Sergei_B","Tunis", "Turkey", "China", "Vietnam"),
                    new Tourist("Galina","Italy","France","Italy"),
                    new Tourist("Anatoly","Montenegro","Albania","Greece","Italy"),
                    new Tourist("Andrii", "UK","Ireland","Spain"),
                    new Tourist("Liubov", "Croatia", "Slovenia", "Spain", "France", "Egypt"),
                    new Tourist("Liam", "Spain", "Portugal", "Morocco", "Cyprus"),
                    new Tourist("Emma", "Greece", "Turkey", "Croatia", "Montenegro"),
                    new Tourist("Mia", "Italy", "Malta", "Spain", "Turkey"),
                    new Tourist("Noah", "Turkey", "Greece", "Italy", "Croatia"),
                    new Tourist("Olivia", "Croatia", "Montenegro", "Albania", "Greece"),
                    new Tourist("Lucas", "Portugal", "Spain", "France", "Italy"),
                    new Tourist("Amelia", "Greece", "Cyprus", "Spain", "Italy"),
                    new Tourist("Oliver", "Spain", "Italy", "Turkey", "Greece"),
                    new Tourist("Isabella", "France", "Spain", "Italy", "Greece"),
                    new Tourist("Ethan", "Italy", "Greece", "Spain", "Croatia"),
                    new Tourist("Ava", "Greece", "Turkey", "Spain", "Italy"),
                    new Tourist("Liam", "Spain", "Italy", "Morocco", "Greece"),
                    new Tourist("Sophia", "Italy", "Spain", "Turkey", "Greece"),
                    new Tourist("Jackson", "Greece", "Spain", "Italy", "Croatia"),
                    new Tourist("Olivia", "Croatia", "Greece", "Italy", "Montenegro"),
                    new Tourist("Logan", "Spain", "Greece", "Italy", "Turkey"),
                    new Tourist("Emma", "Greece", "Italy", "Spain", "Cyprus"),
                    new Tourist("Aiden", "Italy", "Greece", "Spain", "Turkey")
            );
        }

}
