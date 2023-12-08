package hw_Lesson29.Task3;

//Задание 4. (на повторение и закрепление) Задан массив целых чисел {-5, 17, 23, -30, 22, 18, -3, 77, 19, -2}.
// Найдите среднюю величину по всем четным элементам массива. Разработайте соответсвующий тест (набор тестов).
public class ArrayMethods {
    private int[] array = {-5, 17, 23, -30, 22, 18, -3, 77, 19, -2};


    public int sumOfEvenElements(int[] arr) {
        int sumOfEvenEl = 0;
        int count = 0; //
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0 && arr[i] % 2 == 0) {  // проверка элемента массива на четность + исключим 0
                sumOfEvenEl += arr[i];// сумма четных элементов
                count++;// сколько четных элементов
            }
        }
        if (count > 0) {
            return sumOfEvenEl / count;// средняя величина
        }
        else {
            return 0;
        }
    }

}
