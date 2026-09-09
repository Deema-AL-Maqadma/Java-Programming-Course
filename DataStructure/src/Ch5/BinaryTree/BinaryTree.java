package Ch5.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree<T> {

    class Node<T> {

        T data;
        Node<T> left, right;

        public Node(T data) {
            this.data = data;
            this.left = null;
            this.right = null;

        }

    }
    Node<T> root;

    public BinaryTree() {
        this.root = null;
    }

    public void Insert(T data) { // add elenment
        Node<T> newNode = new Node<>(data);
        if (root == null) {
            root = newNode;
            return;
        }
        Queue<Node<T>> queue = new LinkedList<>();
        queue.add(root);
        Node<T> current;
        while (!queue.isEmpty()) {
            current = queue.poll();
            if (current.left == null) {
                current.left = newNode;
                return;
            } else {
                queue.add(current.left);
            }
            if (current.right == null) {
                current.right = newNode;
                return;
            } else {
                queue.add(current.right);
            }
        }

    }
    

}
