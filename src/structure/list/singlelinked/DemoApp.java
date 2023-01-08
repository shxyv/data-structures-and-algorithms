package structure.list.singlelinked;

public class DemoApp {
    public static void main(String[] args) {

        LinkedList<String> stringLinkedList = new LinkedList<>();

        stringLinkedList.add("one");
        stringLinkedList.add("two");
        stringLinkedList.add("three");
        stringLinkedList.add("four");
        stringLinkedList.add("five");

        stringLinkedList.remove(4);

        stringLinkedList.print();
        System.out.println(stringLinkedList.size());
    }
}
