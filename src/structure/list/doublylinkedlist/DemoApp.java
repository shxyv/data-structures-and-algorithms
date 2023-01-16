package structure.list.doublylinkedlist;

public class DemoApp {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        linkedList.add("4");
        linkedList.add("5");
        linkedList.add("6");

        System.out.println(linkedList.get(3));

        linkedList.print();
        System.out.println(linkedList.size());

    }

}
