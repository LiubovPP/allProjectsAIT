package hwLesson17;

//Задание 3.(*) Штрих-код имеет строго регламентированную длину, то есть количество цифр, которое в нем содержится
// (обычно это 8 или 13 цифр). Создать класс Code, в котором реализовать методы:
//
//lengthCode(long code), который возвращает длину штрих-кода
//controlSum(long code), который возвращает сумму всех цифр штрих кода
//isValid(long code), который проверяет штрих-код на правильное количество цифр
public class Barcode {
    public static void main(String[] args) {
lengthCode(1549878464);
    }
    //метод для вычисления длины штрих-кода
public static long lengthCode (long code){
        String codeStr =String.valueOf(code);
return codeStr.length();
}
    // Метод для вычисления суммы всех цифр штрих-кода


//public class Code {
//    // Метод для вычисления длины штрих-кода
//    public static int lengthCode(long code) {
//        String codeStr = String.valueOf(code);
//        return codeStr.length();
//    }
//
//    // Метод для вычисления суммы всех цифр штрих-кода
//    public static int controlSum(long code) {
//        int sum = 0;
//        String codeStr = String.valueOf(code);
//
//        for (int i = 0; i < codeStr.length(); i++) {
//            char digitChar = codeStr.charAt(i);
//            if (Character.isDigit(digitChar)) {
//                int digit = Character.getNumericValue(digitChar);
//                sum += digit;
//            }
//        }
//
//        return sum;
//    }
//
//    // Метод для проверки штрих-кода на правильное количество цифр
//    public static boolean isValid(long code) {
//        int length = lengthCode(code);
//        return length == 8 || length == 13; // Проверка на 8 или 13 цифр
//    }
//
//    public static void main(String[] args) {
//        long barcode1 = 12345678; // Пример штрих-кода с 8 цифрами
//        long barcode2 = 1234567890123; // Пример штрих-кода с 13 цифрами
//        long barcode3 = 12345; // Пример штрих-кода с неправильной длиной
//
//        System.out.println("Длина штрих-кода 1: " + lengthCode(barcode1));
//        System.out.println("Сумма цифр штрих-кода 1: " + controlSum(barcode1));
//        System.out.println("Штрих-код 1 валиден: " + isValid(barcode1));
//
//        System.out.println("Длина штрих-кода 2: " + lengthCode(barcode2));
//        System.out.println("Сумма цифр штрих-кода 2: " + controlSum(barcode2));
//        System.out.println("Штрих-код 2 валиден: " + isValid(barcode2));
//
//        System.out.println("Длина штрих-кода 3: " + lengthCode(barcode3));
//        System.out.println("Сумма цифр штрих-кода 3: " + controlSum(barcode3));
//        System.out.println("Штрих-код 3 валиден: " + isValid(barcode3));
//    }
//}
}
