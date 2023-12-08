package hw_Lesson26;

public class GreatestCommonDiviser { //  greatest common divisor наибольший общий делитель
    //Задание 2 (*). (на повторение и закрепление) Реализовать метод для нахождения наибольшего общего (НОД) делителя двух
//натуральных чисел. Затем реализовать приложение, в которое передаются два числа в качестве параметров командной строки,
//а оно возвращает их НОД.
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            if (!args[i + 1].equals("0") ) {
                int temp = Integer.parseInt(args[i + 1]);
                args[i + 1] = String.valueOf(Integer.parseInt(args[i]) % Integer.parseInt(args[i+1]));
                args[i] = String.valueOf(temp);
            }// какая то ерунда получилась.... что то со строками не разобралась я еще....не работает код

        }
        System.out.println(.....);

    }
    // сначала здесь написала программу для просто чисел, чтоб понять, просто математически, а потом, чтоб переложить на
    // String[] args, но не довела до конца,пока не понимаю как...

//        int res = greatestCommonDivisor(25, 67);
//        System.out.println("The greatest common divisor of is " + res);
//    }
//// метод Евклида:  Деление продолжается до тех пор, пока в остатке не получится нуль.
//// Последний делитель и есть наибольший общий делитель.
//
//    public static int greatestCommonDivisor(int a, int b) {
//        while (b != 0) {
//            int temp = b;
//            b = a % b;
//            a = temp;
//        }
//        return a;
//    }
}


