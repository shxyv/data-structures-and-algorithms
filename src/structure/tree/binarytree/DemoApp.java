package structure.tree.binarytree;

public class DemoApp {

    public static void main(String[] args) {
        System.out.println(sayHelloRecursive(5));

        BinaryTree<Integer> integerBinaryTree = new BinaryTree<>();

        integerBinaryTree.add(5);
        integerBinaryTree.add(7);
        integerBinaryTree.add(3);

        System.out.println(integerBinaryTree.containsValue(10));


    }

    private static String sayHelloRecursive(int count) {

        if (count != 0) {
            return "Hello " + sayHelloRecursive(count - 1);
        } else {
            return "";
        }

    }

}
