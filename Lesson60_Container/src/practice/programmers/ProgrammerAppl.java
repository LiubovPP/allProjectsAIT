package practice.programmers;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class ProgrammerAppl {
// необходимо ответить на вопросы:
    // 1.кто из программистов знает больше всего языков? (поименно)
    // ФИО - количество языков
    // 2. какие языки наиболее популярны среди программистов в фирме?
    // язык программирования - сколько программистов его знают
public static void main(String[] args) {
    List<Programmer> programmers = getProgrammers();
    System.out.println("-----------Most skilled programmers----------------");
    System.out.println("----------------------------------------");
    printSkilledProgrammers(programmers);

    System.out.println("-----------Most popular technoligies ----------------");

    printMostPopularTechnologies(programmers);

}

    private static void printMostPopularTechnologies(List<Programmer> programmers) {
        System.out.println("--------------Print all technologies---------");
        Iterable<String> technologies =programmers.stream().map(programmer -> programmer.getTechnologies())// преобразование объкта programmer в одно его поле с массивом технологий
                .flatMap(strings -> Arrays.stream(strings)) // каждый из массивов преобразуем в отдельный stream
                .collect(Collectors.toList()); // собираем результат стримов в лист
       // technologies.forEach(System.out::println);
        System.out.println("----------List of technologies-------------");
        StreamSupport.stream(technologies.spliterator(), false)
                .distinct() // убрали дубликаты
                .forEach(System.out::println);
        System.out.println("----------Grouping By Programmers---------");
        Map <String, Long>  techFrequency=programmers.stream()
                .map(Programmer::getTechnologies)
                .flatMap(Arrays::stream)
                .collect(Collectors.groupingBy(t-> t, Collectors.counting()));
        System.out.println(techFrequency);
        Long max = techFrequency.values().stream().max(Long::compare)
                .orElse(0L);
        techFrequency.entrySet().stream().filter(e-> max.equals(e.getValue())).forEach(e-> System.out.println(e.getKey()));
    }

    private static void printSkilledProgrammers(List<Programmer> programmers) {
        Map<Integer, List<Programmer>> skilledProgrammers = programmers.stream()
                .collect(Collectors.groupingBy(programmer -> programmer.getTechnologies().length));
        Integer max = skilledProgrammers.keySet().stream().max(Integer::compareTo).orElse(0);
        skilledProgrammers.get(max).forEach(System.out::println);
//        System.out.println(programmers);
//        System.out.println("-----------------------");
//        programmers.stream().forEach(System.out::println);
//
//        Map<Integer, List<Programmer>> skilledProgrammers = new HashMap<>();
//        int max = 0;
//        for (Programmer programmer: programmers
//             ) {int key = programmer.getTechnologies().length;
//            max = key > max ? key : max; // обновили max, если он стал больше
//            skilledProgrammers.putIfAbsent(key, new ArrayList<>());
//            List<Programmer> programmerList = skilledProgrammers.get(key);
//            programmerList.add(programmer);
//
//        };
//        System.out.println(skilledProgrammers);
    }

    private static List<Programmer> getProgrammers() {
        return List.of(
                new Programmer("Peter", "С++", "Python", "Java", "Kotlin"),

                new Programmer("John",  "Python", "Java"),
                new Programmer("Helen", "Kotlin", "Scala", "Java", "JavaScript"),
                new Programmer("Jacob", "Python", "Go"),
                new Programmer("Mikhail", "Fortran", "Algol", "PL-1")

        );
    }

}
