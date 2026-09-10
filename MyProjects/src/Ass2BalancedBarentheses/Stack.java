/**
 * My Name : Deema Mohammed AL-Maqadma ID : 2023200766
 * https://youtu.be/cKamhdith5M?si=q9faiVUQhiAhifYU
 */
package Ass2BalancedBarentheses2023200766;

public class Stack<T> {
    
class Node<T> {

    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

}

    private Node<T> top;
    private int size;

    public Stack() {
        this.top = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(T data) {
        Node<T> newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty ..");
            return null;
        }
        T data = top.data;
        top = top.next;
        size--;
        return data;
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty ..");
            return null;
        }
        return top.data;
    }

}
