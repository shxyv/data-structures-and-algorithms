package structure.queue.regular;

import java.util.Objects;

public class Queue<T> {

    private T value;
    private int rear;
    private int front;
    private T[] array;
    private int size;

    public Queue() {
        size = 10;
        rear = -1;
        front = -1;
        array = (T[]) new Object[size];
    }

    public void enqueue(T value) {
        if (isFull()) doubleSize();
        if (isEmpty()) front = 0;

        array[++rear] = value;
    }

    public void dequeue() {
        if (isEmpty()) throw new RuntimeException("Queue is empty!");
        array[front] = null;
        front++;
    }

    public boolean isFull() {
        return rear == size - 1;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    private void doubleSize() {
        T[] newArray = (T[]) new Object[this.size * 2];

        for (int i = 0; i < this.size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
        this.size = this.size * 2;
    }

    public void print() {
        for (T element : array) {
            if (Objects.nonNull(element))
                System.out.println(element);
        }
    }


}
