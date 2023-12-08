package practice.hashset;

public class IHashSetAppl {
    public static void main(String[] args) {
        Iset<String> mySet = new IHashSet<>();
        System.out.println(mySet.size());

        mySet.add("Berlin");
        mySet.add("Leipzig");
        mySet.add("Munchen");
        mySet.add("Hamburg");
        mySet.add("Bamberg");
        System.out.println(mySet.size());
        mySet.add("Bamberg");
        System.out.println(mySet.size());

        System.out.println("===== Number ======");
        for (String str:mySet
             ) {
            System.out.println(str);
        }
        Iset<Integer> mySetNumber = new IHashSet<>();
        System.out.println(mySet.size());

        mySetNumber.add(1);
        mySetNumber.add(5);
        mySetNumber.add(100);
        mySetNumber.add(89);
        mySetNumber.add(61);
        mySetNumber.add(7);
        mySetNumber.add(4);

        System.out.println("=====Iterator======");
        for (Integer str:mySetNumber
        ) {
            System.out.println(str);
        }

        Iset<Integer> mySetNumbers = new IHashSet<>();
        System.out.println(mySet.size());
        for (int i = 0; i < 100; i++) {
            mySetNumbers.add(i);
        }
        System.out.println("=====Numbers======");
        for (Integer str:mySetNumbers
        ) {
            System.out.println(str);
    }
        Iset<Integer> mySetNumbersReverse = new IHashSet<>();
        for (int i = 100; i >= 1; i--) {
            mySetNumbersReverse.add(i);
        }
        System.out.println("=====Numbers======");
        for (Integer str:mySetNumbersReverse
        ) {
            System.out.println(str);
        }
}}
