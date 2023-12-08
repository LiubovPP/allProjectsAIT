package practice.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsMethods {
    public static void main(String[] args) {
        // Создайте список известных вам фруктов.
        List<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("pear");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("plum");
        fruits.add("strawberry");
        fruits.add("kiwi");
        fruits.add("pineapple");
        System.out.println("=============================");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println("=============================");

        // Выполните поиск имеющегося и отсутствующего элемента списка.
        String key = "banana";
        int index = Collections.binarySearch(fruits, key);// присваиваем в int
        System.out.println("Index of " + key + " " + index);

        key = "mango"; // отсутствующий элемент
        index = Collections.binarySearch(fruits, key);
        System.out.println("Index of " + key + " " + index);
        System.out.println("=============================");
        // Отсортируйте этот список по алфавиту в прямом и обратном порядке.

        Collections.sort(fruits); // Лексико-графическая сортировка по методу от String по Default (т.е. по алфавиту)
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println("=============================");


        Collections.reverse(fruits);
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println("=============================");


        // сортировка с помощью Comparator
        Comparator <String> reverseComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return - o1.compareTo(o2); // сортируем строки в обратном порядке
            }
        };
        System.out.println("===============reverseComparator==============");
        Collections.sort(fruits, reverseComparator);
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println("=============================");
        // Проверьте работу методов
        // max(Collection<?> coll)
        String max = Collections.max(fruits);
        System.out.println("Max of fruits is "+ max);
        // min(Collection<?> coll), что они возвращают? возвращает первый и последний по алфавиту (по текущей сортировке)!!!
        String min = Collections.min(fruits);
        System.out.println("Min of fruits is "+ min);

    }
}
