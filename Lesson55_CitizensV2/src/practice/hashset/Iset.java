package practice.hashset;

public interface Iset<E> extends Iterable<E> {
    boolean add(E element);

    boolean contains(E element);

    boolean remove(E element);

    int size();

}
