package Consultation;

public class Pizza {
    public static void main(String[] args) {
        int []pizzas= {2,4,3,5,10,3};
        String [] friends ={"Alex","Boris","Vera", "Galia", "Dima","Elena"};
       int indexOfMaxElement = findIndexOfMaxElement(pizzas);
        System.out.println(friends[indexOfMaxElement]+ " ate the most pizzas");
    }
    public static int findIndexOfMaxElement (int[]array){
        int maxElementIndex = 0;
        int max = array[maxElementIndex];
        for (int i = 0; i < array.length; i++) {
            if (array[i]> max){
                max=array[i];
                maxElementIndex= i;}

        }
        return maxElementIndex;
    }
}
