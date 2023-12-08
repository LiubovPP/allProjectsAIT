package practice;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapIntroAppl {
    public static void main(String[] args) {
        // создадим карту, отражающую кол-во людей (население) в городах США
        Map<String, Integer> usaCities = new TreeMap<>();// создали объект типа Map

        usaCities.put("Denver", 600_000);
        usaCities.put("Boston", 670_000);
        usaCities.put("Chicago", 2_700_000);
        usaCities.put("Atlanta", 470_000);
        usaCities.put("New York", 8_500_000);
        usaCities.put("Dallas", 1_300_000);

        System.out.println("Map size " + usaCities.size());
        System.out.println("Is empty? " + usaCities.isEmpty());

        // получение значения по ключу
        Integer num = usaCities.get("Chicago");
        System.out.println(num);
        int population = usaCities.get("Atlanta");
        System.out.println(population);

        // проверка ключа на наличие
        System.out.println(usaCities.containsKey("Boston"));
        System.out.println(usaCities.containsKey("Detroit"));


        System.out.println(usaCities.keySet());
        Collection<Integer> populat = usaCities.values();
        System.out.println(populat);
        int total = 0;
        for (Integer integer : populat
        ) {
            total += integer;
        }
        System.out.println("Total population is " + total);

        // обновим значение по ключу
        num = usaCities.put("Chicago", 2_700_001);
        System.out.println(usaCities.get("Chicago"));
        System.out.println(num);
        num = usaCities.get("Chicago"); // перезапись через этот метод
        System.out.println(num);

        // распечатаем содержимое карты
        System.out.println("==========Print Map================");
        Set<String> keys = usaCities.keySet();
        for (String key : keys) {
            System.out.println(key +" -> "+usaCities.get(key));
        }
        // второй способ распечатки
        System.out.println("==========AnotherPrint Map================");
        Set<Map.Entry<String, Integer>> entries = usaCities.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " => "+entry.getValue());
        }
        System.out.println("==========AnotherPrint Map================");
        System.out.println(usaCities.entrySet());




    }
}
