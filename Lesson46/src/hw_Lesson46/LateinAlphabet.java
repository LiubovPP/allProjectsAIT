package hw_Lesson46;

import java.util.ArrayList;

public class LateinAlphabet {
    public static void main(String[] args) {
        ArrayList<Character> lateinAlphabet = new ArrayList<>();

        // заполняем массив lateinAlphabet
        for (int i = 0; i < 26; i++) {
            char ch = (char) (65 + i);
            lateinAlphabet.add(ch);
        }
        System.out.println(lateinAlphabet);


        // Используем цикл foreach для вывода содержимого
        for (char letter : lateinAlphabet) {
            System.out.print(letter + " ");
        }

        System.out.println();

        // самый короткий вариант
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            lateinAlphabet.add(ch);
        }

        System.out.println("The alhabet list " +lateinAlphabet);
    }
}
