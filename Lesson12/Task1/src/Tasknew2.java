//Задача 2 Удаление элемента
//Напишите программу, которая удаляет из массива элемент по условиям:
//
//по заданной позиции.
//по значению
public class Tasknew2 {
    public static void main(String[] args) {
        int[] source = {154, 21312, 15456, -54649, -2545};
        int x = source[1];
        printArray(source);
        deleteByPosition(source, 1);
        System.out.println();
        printArray(source);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t ");

        }
    }

    public static void deleteByPosition(int[] abc, int index) {
        //или: for (int i = 0; i < abc.length; i++) {if (abc[i]==index){abc[i]=0;}
        abc[index] = 0;
    }
}

