package hwLesson11;

//Создайте массив из 12 случайных целых чисел из отрезка от -15 до 15. Определите какой элемент является в
// этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
public class Task1 {
    public static void main(String[] args) {
        //int n = (int)(Math.random() * (b - a + 1) + a) - генерирует случайное **целое** число в интервале [a, b]
//        a  - может быть, b  - может быть
        int[] numbers = new int[12];

        //Заполняем случайными числами
        int a = -15;
        int b = 15;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * (b - a + 1) + a);
          System.out.print(numbers[i] + "\t");
        }
        System.out.println();
        int max = numbers[0];//Первое возможное значение max
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                index = i;
            }
        }
        System.out.println("Max element " + max + " index = " + index);
    }
}
