package practice.numbers_stream;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;

// - создать с помощью stream поток случайных целых чисел;
//- выведите на печать элементы потока;
//- сколько в потоке получилось положительных чисел? сколько отрицательных?
//- просуммируйте все нечетные элементы потока;
//- найдите максимальное число, минимальное число;
//- выведите значения метода summaryStatistic.
public class RandomStream {
    private static final int N_NUMBER = 6;
    private static final int MIN = -10;
    private static final int MAX = 10;

    public static void main(String[] args) {
        // Свойства (параметры, аргументы для метода), нужные для потока:
        // сколько таких чисел надо, от какого мин. до какого макс
        Stream<Integer> numbers = getRandomNumbers(N_NUMBER, MIN, MAX);
               numbers.forEach(System.out::println);// поток отработал и закрыт

        // печатаем красиво
        Stream<Integer> numbers1 = getRandomNumbers(N_NUMBER, MIN, MAX);
        numbers1.forEach(s-> System.out.print(s + " | "));
        System.out.println();

        // печатаем с индексами
       // IntStream numbers2 = (IntStream) getRandomNumbers(N_NUMBER, MIN, MAX);
        // numbers.forEachIndexed((index, value) -> System.out.println("Индекс: " + index + ", Значение: " + value));

        long positiveCount = getRandomNumbers(N_NUMBER, MIN, MAX)
                .peek(n -> System.out.print(n+ " | "))
                .filter(n -> n > 0)
                .count();
        System.out.println("\nPositive numbers "+positiveCount);

        long negativeCount = getRandomNumbers(N_NUMBER, MIN, MAX)
                .peek(n -> System.out.print(n+ " | "))
                .filter(n -> n < 0)
                .count();
        System.out.println("\nPositive numbers "+negativeCount);

        //- просуммируйте все нечетные элементы потока;
        int oddNumbers = getRandomNumbers(N_NUMBER, MIN, MAX)
                .peek(n -> System.out.print(n + " | "))
                .filter(n -> n % 2 != 0)
                .mapToInt(n-> n.intValue()) // Integer::intValue
                .sum();
        System.out.println("\nSum of odd numbers "+ oddNumbers);

        //- найдите максимальное число, минимальное число;
//        Optional<Integer> max = getRandomNumbers(N_NUMBER, MIN, MAX)
//                .peek(n -> System.out.print(n + " | "))
//                .max(Integer::compareTo);
//        System.out.println(max);  или
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        };

        Optional<Integer> max1 = getRandomNumbers(N_NUMBER, MIN, MAX)
                .peek(n -> System.out.print(n + " | "))
                .max(Integer::compareTo);
        System.out.println(max1);
        Optional<Integer> max = getRandomNumbers(N_NUMBER, MIN, MAX)
              .peek(n -> System.out.print(n + " | "))
         .max(Comparator.comparingInt(Integer::intValue));
        System.out.println(max);

       //  выведите значения метода summaryStatistic
        IntSummaryStatistics intSummaryStatistics = getRandomNumbers(N_NUMBER, MIN, MAX)
                .mapToInt(Integer::intValue)
                .peek(n -> System.out.print(n + " | "))
                .summaryStatistics();
        System.out.println(intSummaryStatistics);
        System.out.println(intSummaryStatistics.getMin());

    }

    private static Stream<Integer> getRandomNumbers(int nNumber, int min, int max) {
        return new Random()
                .ints(min, max)
                .limit(nNumber)
                .boxed(); // упаковка в числа
    }
}
