package hwLesson11;

//Задача 2
//Заменить каждый элемент массива с нечетным индексом на ноль.
//
//Создайте массив из 8 случайных целых чисел из отрезка от -3 до 10
//Выведите массив на экран в строку
//Замените каждый элемент с нечётным индексом на ноль
//Снова выведете массив на экран на отдельной строке
public class Task2 {
    public static void main(String[] args) {
        int[] numbers = new int[8];
// массив из 8 случайных целых чисел из отрезка от -3 до 10
        int a = -3;
        int b = 10;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * (b - a + 1) + a);
            System.out.print(numbers[i] + "\t");////Выведите массив на экран в строку
        }
        //Замените каждый элемент с нечётным индексом на ноль
        System.out.println();
        for (int i = 0; i < numbers.length; i += 2) {
            numbers[i] = 0;
        }
        //Снова выведете массив на экран на отдельной строке
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "\t");
        }
        System.out.println("\n\n");
        System.out.println( "Ураааа!");
    }

}

