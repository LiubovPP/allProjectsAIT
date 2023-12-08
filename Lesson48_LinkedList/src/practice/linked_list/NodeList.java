package practice.linked_list;

public interface NodeList<E> extends Iterable<E>{
    // прописываем методы
    int size(); // метод размер листа

    default boolean isEmpty() {
        return size()==0;
    }

    boolean add(E element); // добавление

    void clear();// зачистка

    default boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    default boolean remove(Object o) {
        int index = indexOf(o);
        if (index < 0) {
            return false;
        }
        remove(index);
        return true;
    }

    boolean add(int index, E element); // добавить на место по индексу

    E get(int index);// получение элемента по индексу

    int indexOf(Object o);//
    int lastIndexOf(Object o);

    E remove(int index);// удаление из листа узла по его номеру (индексу)

    E set(int index, E element);

}
