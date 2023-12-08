public class Task2 {
    public static void main(String[] args) {
        //Задача 2 Удаление элемента
        //Напишите программу, которая удаляет из массива элемент по условиям:
        //
        //по заданной позиции.
        //по значению
        String[] mas = new String[5];
        mas[0] = "ABC";
        mas[1] = "KDP";
        mas[2] = "DGH";
        mas[3] = "LKH";
        mas[4] = "POZ";

        System.out.println();
        for (int i = 0; i < mas.length; i++) {
            if (mas[i].equals("LKH")) {
                mas[i] = null;
            }
            System.out.println(mas[i]);// //по значению


        }
        System.out.println();
        int index = 2;
        for (int j = 0; j < mas.length; j++) {
            if (index == j) {
                mas[j] = null;
            }
            System.out.println(mas[j]);
        }
    }

}
