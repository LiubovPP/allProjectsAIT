package practice;

public class WrapperClassesAppl {
    public static void main(String[] args) {
        // количество цифр в числе, версия 2 (делим на 10, цикл while)
        Long x = 1119876543210L; //это объект класса типа Integer
        String st = x.toString(); // преобразование в строку
        int l = st.length(); // узнали длину строки
        System.out.println("Number of digits in " + x + " = " + l);
        System.out.println(x.MAX_VALUE); // узнать максимальное значение

        Double y = 32456.78;
        String st1 = y.toString();
        System.out.println("Number of digits in " + y + " = " + st1.length());
        Integer a = 1_987_654_321;
        String st3 = a.toString();
        System.out.println("Number of digits in " + a + " = " + st3.length());
        System.out.println(a.MAX_VALUE);

        // присвоение и вычисления
        int n = 20;
        Integer m = 10;
        System.out.println("Примитив n = " + n);
        System.out.println("Object m = " + m);
        m = m + n; // подчеркивание означает, что m  это ссылка  // автоупаковка и распаковка m
        System.out.println("m + n = " + m);
        Double pi = 3.14;
        double circleLength = 2 * pi * 10;
        System.out.println("Circle length = " + circleLength);
        System.out.printf("Circle length = %.2f", circleLength);
        System.out.println();
        // константы классов - оберток
        System.out.println("-----------Constants of Wrapper Classes-----------");
        System.out.println("Integer Max " + Integer.MAX_VALUE);
        System.out.println("Integer Min " + Integer.MIN_VALUE);
        System.out.println("Long Max " + Long.MAX_VALUE);
        System.out.println("Long Min " + Long.MIN_VALUE);
        System.out.println("Double Max " + Double.MAX_VALUE);
        System.out.println("Double Min " + Double.MIN_VALUE);
        // обработка деления на 0
        System.out.println("-------------Not a Number(NaN)--------------");
        double b = 20.0 / 0;
        if (Double.isInfinite(b) || Double.isNaN(b)) { // если бесконечность или несущ. число
            System.out.println("Wrong operation or wrong result");
        } else {
            System.out.println(b);
        }
        // перевод String to number
        System.out.println("Parsing String to number");
        String str = "0987654321";
        int num = Integer.parseInt(str);
        System.out.println("String " + str + " = " + num);

        String str1 = "2.7118281828";
        double exp = Double.parseDouble(str1); // экспонента
        System.out.println("Exp " + str1 + " = " + exp);

    }
}
