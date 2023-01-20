package structure.stack;

import java.util.Objects;

public class Stack<T> {

    private int top;

    private int size;

    private T[] array = (T[]) new Object[10];

    public Stack() {
        this.top = -1;
        this.size = 10;
    }

    public void push(T value) {
        if (isFull()) doubleSize();
        array[++top] = value;
    }

    public void pop() {
        if (isEmpty()) throw new RuntimeException("Stack is empty!");
        array[top--] = null;
    }

    private boolean isFull() {
        return top == size - 1;
    }

    private void doubleSize() {
        T[] doubledArray = (T[]) new Object[this.size * 2];

        for (int i = 0; i < this.size; i++) {
            doubledArray[i] = array[i];
        }
        array = doubledArray;
        this.size = this.size * 2;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void print() {
        for (T element : array) {
            if (Objects.isNull(element)) break;
            System.out.println(element);
        }
    }


}
