package structure.tree.binarytree;

import java.util.Objects;

public class BinaryTree<T extends Comparable<T>> {

    private Node<T> root;


    private Node<T> addRecursive(Node<T> current, T value) {
        if (Objects.isNull(current)) {
            current = new Node<>(value);
        }

        if (value.compareTo(current.getValue()) > 0) {
            current.setRight(addRecursive(current.getRight(), value));
        } else if (value.compareTo(current.getValue()) < 0) {
            current.setLeft(addRecursive(current.getLeft(), value));
        } else {
            return current;
        }
        return current;
    }

    public void add(T value) {
        this.root = addRecursive(this.root, value);
    }

    private boolean containsNodeRecursive(Node<T> current, T value) {
        if (Objects.isNull(current)) {
            return false;
        }

        if (current.getValue() == value) {
            return true;
        }

        return value.compareTo(current.getValue()) < 0 ? containsNodeRecursive(current.getLeft(), value)
                : containsNodeRecursive(current.getRight(), value);
    }

    public boolean containsValue(T value) {
        return containsNodeRecursive(this.root, value);
    }

}
