package hw_Lesson28.isPrime;

public class PrimeChecker {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Число меньше или равно 1 не считается простым.
        }

        if (number == 2) {
            return true; // Число 2 является простым.
        }

        if (number % 2 == 0) {
            return false; // Четные числа больше 2 не являются простыми.
        }

        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false; // Если число делится нацело на i, оно не простое.
            }
        }

        return true; // Если ни одно из условий не выполнилось, число простое.
    }
}
//public class PrimeNumber {
//
//    public boolean isPrime(int n) {
//        boolean isPrime = true;
//        int div = 2;
//        while (div <= n / 2) {
//            if (n % div == 0) {
//                isPrime = false;
//                return isPrime;
//            }
//            div++;
//        }
//        return isPrime;
//    }
//}

