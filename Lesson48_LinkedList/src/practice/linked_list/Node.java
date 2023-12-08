package practice.linked_list;

public class Node<E> {
    // fields
    Node<E> prev; // тип Node - взялся из Java
    E data;
    Node <E> next;
    // constructor

    public Node(Node<E> prev, E data, Node<E> next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }

    @Override
    public String toString() { //TODO
        return "Node{" +
                "prev=" + prev +
                ", data=" + data +
                ", next=" + next +
                '}';
    }
}
