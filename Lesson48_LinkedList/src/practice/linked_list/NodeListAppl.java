package practice.linked_list;

public class NodeListAppl {
    public static void main(String[] args) {
        // создадим список из целых чисел
        NodeList<Integer> listNumbers = new NodeListImpl<>();
        System.out.println(listNumbers.size());// 0
        System.out.println(listNumbers.isEmpty()); // true
        listNumbers.add(100);
        listNumbers.add(200);
        listNumbers.add(300);
        listNumbers.add(400);
        listNumbers.add(500);
        listNumbers.add(600);
        listNumbers.add(700);
        listNumbers.add(800);
        System.out.println(listNumbers.size());//8
        System.out.println(listNumbers.isEmpty()); // false


        for (Integer n : listNumbers
        ) {
            System.out.print(n + " | ");

        }
        System.out.println();

        listNumbers.add(2, 250);
        for (Integer n : listNumbers
        ) {
            System.out.print(n + " | ");

        }
        System.out.println();
        System.out.println(listNumbers.lastIndexOf(900));

        listNumbers.remove(5);
        for (Integer n : listNumbers
        ) {
            System.out.print(n + " | ");

        }
        System.out.println();


        listNumbers.clear();
        for (Integer n : listNumbers
        ) {
            System.out.print(n + " | ");

        }
        System.out.println();
        // список из строк
        NodeList<String> listString = new NodeListImpl<>();
        System.out.println(listString.size());// 0
        System.out.println(listString.isEmpty()); // true

        listString.add("1");
        listString.add("2");
        listString.add("3");
        listString.add("4");
        listString.add("5");
        listString.add("6");
        listString.add("7");
        listString.add("8");
        System.out.println(listString.size());
        System.out.println(listString.isEmpty());
        for (String s : listString
        ) {
            System.out.print(s + " | ");

        }
        System.out.println();
    }
}
