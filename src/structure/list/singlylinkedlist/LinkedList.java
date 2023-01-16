package structure.list.singlylinkedlist;

import java.util.Objects;
import structure.list.List;
import structure.list.error.NoDataFoundException;

public class LinkedList<T> implements List<T> {

    private Node<T> head; // head node\

    private Long size = 0L;


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
        this.size++;
    }

    @Override
    public void remove(long index) {

        validateHeadNode();
        validateIndex(index);

        long counter = index;

        if (index == 0) {
            this.head = head.getNext();
        } else {
            Node<T> current = this.head;
            while ((counter - 1) != 0) {
                current = current.getNext();
                counter--;
            }
            current.setNext(current.getNext().getNext());
        }

        this.size--;
    }

    @Override
    public T get(long index) {

        validateHeadNode();
        validateIndex(index);

        long counter = index;

        Node<T> current = head;
        while (counter != 0) {
            current = current.getNext();
            counter--;
        }

        return current.getValue();
    }

    @Override
    public void print() {
        Node<T> toBePrinted = head;
        while (Objects.nonNull(toBePrinted)) {
            System.out.println("Data: " + toBePrinted.getValue());
            toBePrinted = toBePrinted.getNext();
        }
    }

    @Override
    public Long size() {
        return this.size;
    }

    private void validateIndex(long index) {
        if (index > this.size - 1) {
            throw new IndexOutOfBoundsException(String.format("Index: %s is out of bounds!", index));
        }
    }

    private void validateHeadNode() {
        if (Objects.isNull(this.head)) {
            throw new NoDataFoundException("List is empty!");
        }
    }

}
