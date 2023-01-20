package structure.stack;

public class DemoApp {

    public static void main(String[] args) {

        Stack<Integer> integerStack = new Stack<>();

        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);

        integerStack.pop();
        integerStack.pop();

        integerStack.push(4);
        integerStack.push(5);
        integerStack.push(6);
        integerStack.push(7);
        integerStack.push(8);
        integerStack.push(9);
        integerStack.push(10);
        integerStack.push(11);

        Stack<String> stringStack = new Stack<>();
        stringStack.push("one");
        stringStack.push("two");
        stringStack.push("three");


        integerStack.print();
        stringStack.print();
    }

}
