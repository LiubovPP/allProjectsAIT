package hwLesson15;

//Задача 3. Создать массив из 20-ти случайных целых чисел из интервала от -100 до 100. Реализуйте метод, который
//получает на вход исходный массив и возвращает массив, содержащий только положительные числа из исходного массива.
public class Task3 {
    public static void main(String[] args) {
        int[] Array = new int[20];
        Methods.fillArray(Array, -100, 100);
        System.out.println("Массив заполнен следующим образом: ");
        Methods.printArray(Array);
        Methods.bubbleSortArray(Array);
        System.out.println("сортируем: ");
        Methods.printArray(Array);
        System.out.println();
        System.out.println("Выведем только положительные числа: ");
        Methods.positiveNumbers(Array);
    }
}
