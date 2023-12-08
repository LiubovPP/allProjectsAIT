package practice.seasons;

public class SeasonAppl {
    public static void main(String[] args) {

        // Опробовать на нем методы:
        // .values()
        // .toString
        // .ordinal()

        Season[] seasons = Season.values();// заносим значение  enum в массив
        System.out.println(seasons.length);
        // for loop
        for (int i = 0; i < seasons.length; i++) {
            System.out.println(seasons[i].getName());
        }
        System.out.println("----------- values 2 ---------------");
        // for each
        for (Season s : seasons) System.out.println(s.getNumber());

        System.out.println("----------- toString ---------------");
        String str = Season.WIN.toString();
        System.out.println(str);

        System.out.println("----------- ordinal () ---------------");
        int n = Season.AUT.ordinal();
        System.out.println(n);

        // Для обратного преобразования (строки в объект Day) можно воспользоваться статическим методом valueOf():

        System.out.println("----------- valueOf ---------------");
        Season s = Season.valueOf("SUM");
        System.out.println(s.getName() + " - is the best time of the year!");
    }
}


