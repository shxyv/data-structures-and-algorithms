package structure.list;

import java.util.Objects;

public class LinkedList<T> implements List<T> {

    private Node<T> head; // head node


    @Override
    public void add(T value) {

        Node<T> newNode = new Node<>(value, null);

        if (Objects.isNull(head)) {
            head = newNode;
        } else {
            Node<T> lastNode = this.head;
            while (Objects.nonNull(lastNode.getNext())) {
                lastNode = lastNode.getNext();
            }
            lastNode.setNext(newNode);
        }
    }

    @Override
    public void remove(long index) {

    }

    @Override
    public T get(long index) {
        return null;
    }

    @Override
    public void print() {
        Node<T> toBePrinted = head;
        while (Objects.nonNull(toBePrinted)) {
            System.out.println("Data: " + toBePrinted.getValue());
            toBePrinted = toBePrinted.getNext();
        }
    }


}
