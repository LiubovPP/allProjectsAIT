package homework;

// Задача 4. (*) Даны два списка неуникальных целых чисел или слов. Посчитайте, сколько уникальных элементов содержится
// одновременно, как в первом, так и во втором списке.
import java.util.HashSet;
        import java.util.List;
        import java.util.Set;

public class UniqueElementsCounter {
    public static int countUniqueElements(List<Object> list1, List<Object> list2) {
        Set<Object> set1 = new HashSet<>(list1);
        System.out.println(set1);
        Set<Object> set2 = new HashSet<>(list2);
        System.out.println(set2);
        System.out.println();

        // Создаем копию set1 и удаляем все элементы, которые не содержатся в set2
        Set<Object> commonElements = new HashSet<>(set1);
        System.out.println(commonElements);

        commonElements.retainAll(set2);// retainAll удаляет из commonElements все элементы, которые
        // не содержатся во втором множестве.
        return commonElements.size();

    }

    public static void main(String[] args) {
        // Пример использования
        List<Object> list1 = List.of(1, 2, 3, 4, 5, 5, "apple", "orange");
        List<Object> list2 = List.of(3, 4, 5, 6, 7, "orange", "banana");

        int result = countUniqueElements(list1, list2);
        System.out.println("Количество уникальных элементов: " + result);

    }
}