package practice.cat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

class CatTest {
    Cat cat;
    Cat [] cats;// создали массив

    @BeforeEach
    void setUp() {
        cats = new Cat[4];
        cats[0]= new Cat(101, "Tishka", "brit",5, 3.5);
        cats[1]= new Cat(102, "Genny","sfinks",1, 1.2);
        cats[2]= new Cat(103, "Murzik", "pers",9, 5.0);
        cats[3]= new Cat(104, "Motya", "Maine Coon",2, 8.5);

    }
@Test
    void testCatSort (){
    System.out.println("================= Test Cat Sorting ===================");
    printArray(cats);// печатаем неотсортированный массив
    Arrays.sort(cats);//  выполнили сортировку
    System.out.println("Sort by age");
    printArray(cats);

}

    @Test
    void testCatSortComparator (){
        printArray(cats);// печатаем неотсортированный массив
        //второй способ сортировки
        Comparator <Cat> catComparator=new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                return o1.getName().compareTo(o2.getName());// сравнили по именам (поле name)
            }
        };
        Arrays.sort(cats, catComparator);// выполнили сортировку с помощью Comparator
        System.out.println("Sort by name");
        printArray(cats);

    }
    @Test
    void testCatSortComparator2 (){
        printArray(cats);// печатаем неотсортированный массив
        //второй способ сортировки
        Comparator <Cat> catComparator=new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                return o1.getAge()-o2.getAge();// сравнили по возрасту (поле age)
            }
        };
        Arrays.sort(cats, catComparator);// выполнили сортировку с помощью Comparator
        System.out.println("Sort by age");
        printArray(cats);

    }
public void printArray(Object[] arr){
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
}
}