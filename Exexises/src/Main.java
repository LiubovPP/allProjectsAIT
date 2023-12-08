import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        joinNumbersFromRange(4, 6);

    }

    public static String joinNumbersFromRange(int start, int finish) {
        // BEGIN (write your solution here)
        // Нейтральный элемент для строк – пустая строка
        var result = "";
        var i = start;

        while (i <= finish) {
            // Каждый раз добавляем строку к результату
            result = result + i;
            i = i + 1;
        }

        return result;
        // END
    }
}

