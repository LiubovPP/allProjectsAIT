package hw_Lesson25;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //Задание 2.(*) Напишите программу, которая запрашивает строку от пользователя и затем:

        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите ваш текст: ");
        String string = scanner.nextLine();
        String[] words = string.split(" ");
        System.out.println("В вашем тексте "+ words.length+ " слов"); //сообщает сколько слов в строке
        System.out.println("В вашем тесте " +string.length()+ " букв");//сообщает сколько букв (символов) в строке
        String [] letters = string.split("");
        // System.out.println(Arrays.toString(letters)); // это я для себя делала
        for (int i = letters.length; i >0; i--) {
            System.out.print(letters[i-1]);//печатает строку задом наперед, начиная с последнего слова.
        }
    }
}
