package practice.hashset;

import java.util.Iterator;
import java.util.LinkedList;

public class IHashSet <E> implements Iset<E> {
// поля
    private LinkedList <E> [] hashset; // это массив из связанных листов, то есть
    // каждый элемент массива - это отдельный LinkedList <E>
    private int size;
    private int capacity; // кол-во ячеек в подвешенном состоянии
    private double loadFactor; // длина или объем загрузги

    public IHashSet(int capacity, double loadFactor) {
        this.capacity = capacity;
        this.loadFactor = loadFactor;
        hashset = new LinkedList[capacity]; // это массив из LinkedList
        // каждый элемент массива - это отдельный LinkedList <E>
    }
// в этом конструкторе можно определить свой loadFactor
    public IHashSet (int capacity){
        this(capacity, 0.75); // 0.75 - это насколько загрузить
    }

    // конструктор по умолчанию
    public IHashSet () {
        this(16, 0.75);
    }

    @Override
    public boolean add(E element) {
        if (size>= capacity * loadFactor){
            rebuildArray();
        }
        int index = getIndex(element);
        if (hashset [index]== null) {
            hashset[index] = new LinkedList<>();
        }
        if (hashset [ index].contains(element)) {
            return false;
        }
        hashset[index].add(element);
        size++;
        return true;
    }
private void rebuildArray (){
        capacity = capacity*2; // удволили размер
    LinkedList<E> [] newHashSet = new LinkedList[capacity];
    // надо обежать весь hashSet, залезть в каждый его LinkedList, переложить элементы в новый
    for (int i = 0; i < hashset.length; i++) {
        if (hashset[i] != null) {
            for (E e:hashset[i]
                 ) {
                int index = getIndex(e);
                if (newHashSet[index] == null) {
                    newHashSet[index] = new LinkedList<>();
                }
                newHashSet[index].add(e);
            }
        }
    }
    hashset = newHashSet; // переопределили ссылку, garbage collector очистит память
    }

    private int getIndex(E element) {
        int hashcode = element.hashCode(); // вычисляем hashcode элемента
        hashcode = hashcode >= 0 ? hashcode : -hashcode;
        return hashcode % capacity; // деление с остатком
    }

    @Override
    public boolean contains(E element) {
        int index = getIndex(element);
        if (hashset [index]== null) { return false;
        }
        return hashset[index].contains(element); // проверяем наличие элемента
    }

    @Override
    public boolean remove(E element) {
        int index = getIndex(element);
        if (hashset[index] == null) {

            return false;
        }
        boolean res = hashset[index].remove(element);
        if (res) {
            size--;
        }
        return res;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int i;
            int j;
            int totalCounter;
            @Override
            public boolean hasNext() {
                return totalCounter < size; // пока есть что перебирать
            }

            @Override
            public E next() {
                while (hashset [i]== null || hashset [i].isEmpty()) {
                    i++;
                }
                E res = hashset[i].get(j);
                totalCounter++;
                if (j < hashset[i].size() - 1) // находимся внутри LinkedList
                {
                    j++;
                } else {
                    j = 0;
                    i++;
                }

                return res;
            }
        };
    }
}
