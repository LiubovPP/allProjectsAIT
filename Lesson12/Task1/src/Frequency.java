public class Frequency {
    public static void main(String[] args) {
        int[] mas = {1, 2, 3, 2, 4, 1, 3, 5, 6, 5};

        // Создаем массив для хранения частот (индекс - число, значение - частота)
        int[] frequency = new int[11]; // Массив для чисел от 0 до 10

        // Проходим по массиву и увеличиваем частоту каждого числа
        for (int number : mas) {
            frequency[number]++;
        }

        // Выводим результат на консоль
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Число " + i + " встречается " + frequency[i] + " раз(а)");
            }
        }
    }
}




