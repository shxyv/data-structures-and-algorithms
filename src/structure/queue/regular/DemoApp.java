package structure.queue.regular;

public class DemoApp {

    public static void main(String[] args) {

        Queue<Integer> integerQueue = new Queue<>();

        integerQueue.enqueue(1);
        integerQueue.enqueue(2);
        integerQueue.enqueue(3);
        integerQueue.enqueue(4);
        integerQueue.enqueue(5);

        integerQueue.dequeue();
        integerQueue.dequeue();

        integerQueue.print();



    }

}
