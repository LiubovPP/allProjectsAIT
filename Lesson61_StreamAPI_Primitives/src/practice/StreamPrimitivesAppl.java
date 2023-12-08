package practice;

import java.util.IntSummaryStatistics;
import java.util.Random;
import java.util.stream.Stream;

public class StreamPrimitivesAppl {
    private static final int N_NUMBERS = 10;
    private static final int MIN = 1;
    private static final int MAX = 10;

    public static void main(String[] args) {
        // получить случайные целые числа в виде потока
        Stream<Integer> numbers = getRandomNumbers(N_NUMBERS, MIN, MAX);
        numbers.forEach(System.out::println);
        System.out.println("----------Sum of numbers-------------");
        int sum = getRandomNumbers(N_NUMBERS, MIN, MAX).mapToInt(Integer::intValue /* или n-> n.intValue()*/)
                .peek(System.out::println).sum();
        System.out.println(sum);
        System.out.println("-------Summary Statistics---------");
        IntSummaryStatistics intSummaryStatistics = getRandomNumbers(N_NUMBERS, MIN, MAX)
                .mapToInt(Integer::intValue)
                .peek(System.out::println)
                .summaryStatistics();
        System.out.println("min ="+ intSummaryStatistics.getMin());
        System.out.println("max ="+ intSummaryStatistics.getMax());
        System.out.println("sum ="+ intSummaryStatistics.getSum());
        System.out.println("Avg ="+ intSummaryStatistics.getAverage());

        System.out.println("----------Lotto 6 from 49----------");
        new Random().ints(1,50).distinct().
                limit(6).forEach(System.out::println);

        System.out.println("------Shuffle----------");
        int[] arr = {10, 20, 30, 40, 50};
        // нужно перетасовать в случайном порядке этот массив
        // идея - тасовать индексы
        new Random().ints(0, args.length) // в этом диапазоне тасуем индексы
                .distinct() // удаляем дубликаты
                .limit(args.length)
                .forEach(i -> System.out.println(arr [i]));
    }

    private static Stream<Integer> getRandomNumbers(int nNumbers, int min, int max) {
        return new Random()
                .ints(min, max) // примитивы int, здесь появляется Stream
                .limit(nNumbers)
                .boxed(); // автоупаковка из int в Integer
        //  или .mapToObj(n -> (Integer) n); // перевели в объекты Integer
         }
}
