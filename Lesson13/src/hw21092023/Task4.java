package hw21092023;

//Задача 1 "Слова в обратном порядке"
//Пользователь вводит нескольких слов. Сохраните каждое слово в
//массиве и выведите все слова в обратном порядке.

public class Task4 {
    public static void main(String[] args) {
        String[] arr = {"верно", "ты", "думаешь", ", ", "наверное"};
        printArray(arr);
        reverseArray(arr);
        System.out.println("Переворачиваем: ");
        printArray(arr);

    }

    public static void reverseArray(String[] arr) {
        String temp = "";
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i]; // берем левый элемент во временную переменную
            arr[i] = arr[arr.length - 1 - i]; // переносим правый элемент на место левого
            arr[arr.length - 1 - i] = temp; // место правого ставим тот, что во временной переменной
        }
    }

    public static void printArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


}
