package practice.linked_list;

import java.util.Iterator;

public class NodeListImpl <E> implements NodeList<E> {
    // fields
    private Node<E> first;
    private Node<E> last;
    private int size;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean add(E element) {
      Node<E> newNode = new Node<>(last, element, null); // создаем следующий узел в конце списка
        if (last != null) {
            last.next = newNode;
        } else {
            first = newNode;// если список был пустой
        }
        last = newNode;
        size++;
        return true;
        // узел новый, в конец списка
    }

    @Override
    public void clear() {    // Remove all elements from the list
        first = null;
        last = null;
        size = 0;
        // или frist = last = null;
        //     size = 0;
            }

    @Override
    public boolean add(int index, E element) {
        if (index == size) { // добавление в конец
            return add(element);
        }
        Node<E> node = getNodeByIndex(index);
        Node<E> newNode = new Node<>(node.prev, element, node);
        node.prev = newNode;
        if (index != 0) {
            newNode.prev.next = newNode;
        } else {
            first = newNode;
        }
        size++;
        return true;
    }

    private Node<E> getNodeByIndex(int index) {
        checkIndex(index);
        Node<E> node;
        if (index < size / 2) {
            node = first;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
        } else {
            node = last;
            for (int i = size - 1; i > index; i--) {
                node = node.prev;
            }
        }
        return node;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(index);
        }
    }

    @Override
    public E get(int index) {
        Node<E> node = getNodeByIndex(index);
        return node.data;
    }

    @Override
    public int indexOf(Object o) {
        int index = 0;
        if (o != null) { // внутри узла не null
            for (Node<E> node = first; node != null; node = node.next, index++) {
                if (o.equals(node.data)) {
                    return index;
                }
            }
        } else { // null внутри узла
            for (Node<E> node = first; node != null; node = node.next, index++) {
                if (o == node.data) {
                    return index;
                }
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {//TODO
        int lastIndex = -1;  // Initialize to -1, indicating not found

        if (o == null) {
            Node<E> current = first;
            int index = 0;

            while (current != null) {
                if (current.data == null) {
                    lastIndex = index;
                }

                current = current.next;
                index++;
            }
        } else {
            Node<E> current = first;
            int index = 0;

            while (current != null) {
                if (o.equals(current.data)) {
                    lastIndex = index;
                }

                current = current.next;
                index++;
            }
        }

        return lastIndex;
    }

    @Override
    public E remove(int index)
     {
        Node<E> node = getNodeByIndex(index);
        return unlink(node);
    }

    private E unlink(Node<E> node) {
        E victim = node.data;
        Node<E> prev = node.prev;
        Node<E> next = node.next;
        if (prev != null) {
            prev.next = next;
            node.prev = null;
        } else {
            first = next;
        }
        if (next != null) {
            next.prev = prev;
            node.next = null;
        } else {
            last = prev;
        }
        node.data = null;
        size--;
        return victim;
    }

    @Override
    public E set(int index, E element) {
        Node<E> node = getNodeByIndex(index);// нашли узел по индексу
        E victim = node.data;
        node.data = element;// обновили данные
        return victim;

    }

    @Override
    public Iterator<E> iterator() {

        return new Iterator<E>() {
            Node <E> node = first;
            @Override
            public boolean hasNext() {
                return node != null;
            }

            @Override
            public E next() {
                E data = node.data;
                node = node.next;
                return data;
            }
        };
    }
}
