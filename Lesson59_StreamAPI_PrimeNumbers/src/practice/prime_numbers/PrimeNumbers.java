package practice.prime_numbers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class PrimeNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(
                10,11,12,13,14,15,16,17,18,19,20,21,22
        ));

        System.out.println("Numbers: ");
        numbers.stream().forEach(integer -> System.out.print(integer+ " "));// терминальная операция
        System.out.println();

        // отобрать только простые числа из этого списка
        System.out.println("Prime numbers: ");
        numbers.stream().filter(integer -> isPrime(integer)).forEach(integer -> System.out.print(integer+" "));
        // отобрали простые числа
                System.out.println();
        Stream<Integer> numbers1 = Stream.of(10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        System.out.println("Prime numbers: version 2 ");
        numbers1.map(n -> isPrime(n))
                .forEach(n-> System.out.print(n + " | "));

    }

    private static boolean isPrime(int n) {
        int i = 2;
        while(i < n){
            if(n % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}
