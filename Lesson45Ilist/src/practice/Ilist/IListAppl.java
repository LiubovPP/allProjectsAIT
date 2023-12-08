package practice.Ilist;



public class IListAppl {
    public static void main(String[] args) {
    /*    // список с целыми числами
        IList<Integer> list = new IListImpl<>();
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.indexOf(30));
        System.out.println(list.toString().length());

//        list.clean();
//        System.out.println(list.size());
        System.out.println(list.contains(10));
        System.out.println(list.remove(0));

//        System.out.println(list.add(4,200));
//        System.out.println(list.size());
*/

        IList<String> city = new IListImpl<>();
        System.out.println(city.size());
        System.out.println(city.isEmpty());
        city.add("London");
        city.add("Berlin");
        city.add("Paris");
        city.add("Madrid");
        city.add("Moscow");
        System.out.println(city.size());
        System.out.println(city.isEmpty());

        for (int i = 0; i < city.size(); i++) {
            System.out.print(city.get(i)+ "  ");
        }
        System.out.println();
        for (String s : city) {
            System.out.print(s + " | ");
        }

        // city.forEach(c->System.out.println(" "+ city));

    }
//    public void printArray (IList <String> array) {
//        for (String o:array) {
//            System.out.println(o + " | ");
//        }
//        System.out.println();
//    }
}
