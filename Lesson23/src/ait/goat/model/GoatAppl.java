package ait.goat.model;

public class GoatAppl {
    public static void main(String[] args) {
        Goat goatling1 = new Goat();
        for (int i = 0; i < 10; i++) {
            goatling1.count++; // or Goat.count++; если переменная в class static
        }
        System.out.println(goatling1.count);
        Goat goatling2 = new Goat();
        for (int i = 0; i < 10; i++) {
            goatling2.count++; // or Goat.count++;
        }
        System.out.println(goatling2.count);
        System.out.println(goatling1.count);
    }


}
