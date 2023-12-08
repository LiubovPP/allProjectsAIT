package practice.stream_intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAppl {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(
                1, 9, 8, 2, 3, 7, 4, 6, 5));
        numbers.stream() // открыли поток
                .filter(n -> n > 3)// отбираем числа больше 3
                .peek(n -> System.out.println("peek before sort: " + n)) // промежуточная печать
                .sorted((n1, n2) -> -Integer.compare(n1, n2)) // сортировка
                .forEach(System.out::println); // печать

        System.out.println("==============================");
        numbers.forEach(System.out::println); // еще один вариант печати
        System.out.println("==============================");

        Integer[] arr = {1, 9, 2, 8, 3, 7, 4, 6, 5};
        Stream<Integer> streamInt = Arrays.stream(arr)
                .filter(n -> n > 2)
                .filter(n -> n % 2 == 0)
                .sorted((n1, n2) -> -Integer.compare(n1, n2));
        streamInt.forEach(System.out::println);
        System.out.println("==============================");

        Integer res = Arrays.stream(arr)
                .map(n -> n * 10) // преобразование в числа
                .reduce(0, (accum, n) -> accum + n); // накопление
        System.out.println("sum = " + res);

        System.out.println("==============================");

        String str = Arrays.stream(arr)
                .sorted() // или ((n1, n2) -> -Integer.compare(n1, n2)); обратная сортировка
                .map(Object::toString) // преобразование в строку
                .reduce("Result = ", (accum, n) -> accum + " " + n); // накопление
        System.out.println(str);
        System.out.println("==============================");
    }


}
