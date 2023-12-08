package Consultation;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 20;
        int [] source = new int[n];
        generate(source);
        System.out.println("Числа Фиббоначи в количестве "+n +" штук \n");
        printArray(source);
    }
    public static void generate (int []array){
        array[0]=0;
        array[1]=1;
        for (int i = 2; i < array.length; i++) {

            array[i]=array[i-1]+array[i -2];
        }
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }
}
