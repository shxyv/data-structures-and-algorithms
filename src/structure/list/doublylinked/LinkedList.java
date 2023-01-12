package structure.list.doublylinked;

import java.util.Objects;
import structure.list.List;
import structure.list.error.NoDataFoundException;

public class LinkedList<T> implements List<T> {

    private Node<T> head;

    private Node<T> tail;

    private Long size = 0L;


    @Override
    public void add(T value) {

        Node<T> newNode = new Node<>(value);

        if (Objects.isNull(head)) {
            head = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrev(tail);
        }
        tail = newNode;

        this.size++;
    }

    @Override
    public void remove(long index) {

        validateIndex(index);
        validateHeadNode();

        long mid = this.size / 2;

        Node<T> current;
        long counter;
        if (index <= mid) {
            current = head;
            counter = index;
            while (counter != 0) {
                current = current.getNext();
                counter--;
            }
        } else {
            current = tail;
            counter = this.size;
            while (counter == index) {
                current = current.getPrev();
                counter--;
            }
        }
        remove(current);
        this.size--;
    }

    public void remove(Node<T> node) {

        validateHeadNode();

        if (this.head == node) {
            this.head = head.getNext();
        }

        if (Objects.nonNull(node.getNext())) {
            node.getNext().setPrev(node.getPrev());
        }

        if (Objects.nonNull(node.getPrev())) {
            node.getPrev().setNext(node.getNext());
        }
    }

    @Override
    public T get(long index) {

        validateIndex(index);
        validateHeadNode();

        long mid = this.size / 2;

        Node<T> current;
        if (mid >= index) {
            long counter = index;
            current = head;
            while (counter != 0) {
                current = current.getNext();
                counter--;
            }
        } else {
            current = tail;
            long counter = this.size;
            while (counter == index) {
                current = current.getPrev();
                counter--;
            }
        }
        return current.getValue();
    }

    @Override
    public void print() {
        Node<T> current = head;
        while (Objects.nonNull(current)) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }

    @Override
    public Long size() {
        return this.size;
    }

    private void validateIndex(long index) {
        if (index > this.size) {
            throw new IndexOutOfBoundsException(String.format("Index: %s is out for bounds!", index));
        }
    }

    private void validateHeadNode() {
        if (Objects.isNull(head)) {
            throw new NoDataFoundException("List is empty!");
        }
    }
}
