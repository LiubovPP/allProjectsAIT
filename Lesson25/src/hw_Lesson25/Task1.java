package hw_Lesson25;

public class Task1 {
    public static void main(String[] args) {
        //Задача 1. Дана строка "I'm proud to learn Java! Java is the most famous programming language!!!"
        //Выполнить практикум с этой строкой:

        String str1 = "I'm proud to learn Java! Java is the most famous programming language!!!";
        System.out.println(str1);

        System.out.println(str1.charAt(str1.length()-1));//Распечатать последний символ строки.
        System.out.println(str1.indexOf("Java"));//Найти позицию подстроки “Java” в строке.
        System.out.println(str1.contains("Java")); //Проверить, содержит ли заданная строка подстроку “Java”.
        System.out.println(str1.replace("o","a"));//Заменить все символы “o” на “a”.
        System.out.println(str1.toUpperCase()); //Преобразуйте строку к верхнему регистру.
        System.out.println(str1.toLowerCase()); //Преобразуйте строку к нижнему регистру.
        System.out.println(str1.substring(19, 23));//Вырезать подстроку Java c помощью метода substring().
        System.out.println(str1.endsWith("!!!"));//Проверить, заканчивается ли строка подстрокой “!!!”.
        System.out.println(str1.startsWith("I'm proud")); //Проверить, начинается ли строка подстрокой “I'm proud”.

    }
}
