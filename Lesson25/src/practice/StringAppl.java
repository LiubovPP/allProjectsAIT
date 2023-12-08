package practice;

import java.util.Arrays;

// 10.10.2023
public class StringAppl {
    public static void main(String[] args) {
        System.out.println("-----------------------------------");
        String str = "Hello";
        char[] chars = {32, 'w', 'o', 'r', 'l', 'd'}; // 32 - это код для пробела
        String str1 = new String(chars); // собираем строку из чаров
        System.out.println(str1);
        str = str + str1;
        System.out.println(str);
        str = str.concat(str1);// аналогичная операция, добавил еще раз слово world
        // .concat (); конкатенация - сцепление
        System.out.println(str);
        int l = str.length();
        System.out.println("Length of string - Длина строки - " + str + " : " + l);
        char c = str.charAt(str.length() - 1); //определяем последний символ в строке
        System.out.println("Last symbol of string: " + c);
        System.out.println("-----------------------------------");
        System.out.println("Print by letters: Печать по буквам: ");
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + "  ");
        }
        System.out.println();
        System.out.println("-----------------------------------");
        String str2 = " World"; // будем сравнивать str1 с str2
        System.out.println(str1.equals(str2)); // false
        System.out.println(str1.equalsIgnoreCase(str2)); // true
        String str3 = str1.toUpperCase(); // переводим строку в Заглавные
        System.out.println(str3);
        System.out.println(str3.toLowerCase()); // переводим в низкий регистр
        System.out.println("-----------------------------------");
        // позиция в строке - index
        int index = str.indexOf('l'); // str = str + str1;
        System.out.println("Index of l = " + index);
        index = str.indexOf("or"); // с какого индекса начинается or
        System.out.println("Index of or = " + index);
        index= str.indexOf('l',4); // ищем l, начиная с 4-го индекса
        System.out.println(index);
        index = str.lastIndexOf('l'); // индекс последнего нахождения l
        System.out.println(index);
        index= str.indexOf('A'); // ищем индекс отсутствующей буквы
        System.out.println(index); // получаем -1
        System.out.println("-----------------------------------");
        System.out.println(str.substring(4)); // substring - подстрока - возвращает часть строки, начиная с индекса
        System.out.println(str.substring(1,8)); // выдаст: ello wo
        System.out.println(str.replace("o", "o-o-o"));// Hello-o-o wo-o-orld wo-o-orld
        System.out.println("-----------------------------------");
        String str4 = "             Bill         ";
        System.out.println(str4);
        str4= str4.trim(); // отрезает пробелы
        System.out.println(str4);
        String str5 = "I love String in Java!";
        String[] words = str5.split(" "); // пробелом разделили строку на слова и занесли слова в массив
        System.out.println("Quantity of words in string: "+ words.length);
        System.out.println(Arrays.toString(words));
        String str6 = "Я помню чудное мгновение...";
        String [] letters = str6.split(""); // делим на буквы, разделителя нет, просто кавычки
        System.out.println("Quantity of words in string: "+ letters.length);
        System.out.println(Arrays.toString(letters));
    }
}
