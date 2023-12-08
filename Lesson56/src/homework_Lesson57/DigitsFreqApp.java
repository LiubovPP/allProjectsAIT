package homework_Lesson57;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

//Задача 2. В классе DigitsFreqApp сгенерировать один миллион положительных целых чисел, и подсчитать частоту
// встречаемости цифр в этих числах.
public class DigitsFreqApp {
    public static void main(String[] args) {
        int[] numbers = new int[1000000];
        numbers = generateNum(numbers);

        Map<Integer, Integer> digitFrequency= printNumbersFrequency(numbers);
        printDigitFrequency(digitFrequency);
    }
    // Вывод результатов
    private static void printDigitFrequency(Map<Integer, Integer> digitFrequency) {
        System.out.println("Частота встречаемости цифр:");

        for (Map.Entry<Integer, Integer> entry : digitFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private static Map<Integer, Integer> printNumbersFrequency(int[] numbers) {
     // Подсчет частоты встречаемости цифр
            Map<Integer, Integer> digitFrequency = new HashMap<>();

            for (int number : numbers) {
                while (number > 0) {
                    int digit = number % 10;
                    digitFrequency.put(digit, digitFrequency.getOrDefault(digit, 0) + 1);
                    number /= 10;
                }
            }
        System.out.println(digitFrequency);
            return digitFrequency;
    }

    private static int[] generateNum(int[] arr) {
        Random random = new Random();
        int min = 1;
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt((max + 1) - min) + min;
        }
        return arr;
    }
}
