public class Check {
    public static void main(String[] args) {
        task4(3);
    }
    public static void task4(int numberMax) { //  numberMax - до введенного пользователем числа = 3
        int result = 0;

        // counter = 1, numberMax = 3
        // 1 <= 3 - true
        // 1 + 0 = 1; (result = counter + result )

        // counter = 2, numberMax = 3
        // 2 <= 3 - true
        // 2 + 1 = 3; (result = counter + result )

        // counter = 3, numberMax = 3
        // 3 <= 3 - true
        // 3 + 3 = 6; (result = counter + result )

        // counter = 4, numberMax = 3
        // 4 <= 3 - false
        // выход

        for (int counter = 1; counter <= numberMax; counter++) {
            System.out.println("Итерация: " + counter);
            System.out.println("Результат до вычисления: " + result);
            result += counter;
            System.out.println("Результат после вычисления: " + result);
        }
        System.out.println("Общий результат вычисления: " + result);
    }
}

