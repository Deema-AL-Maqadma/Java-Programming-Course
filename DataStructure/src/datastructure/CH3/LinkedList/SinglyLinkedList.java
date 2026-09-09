package datastructure.CH3.LinkedList;

class Node <T> {

    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList<T> {

    private Node<T> head;
    private int size;

    public SinglyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void InsertAtBeginning(T data) {
        Node<T> newNode = new Node<T>(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void InsertAtEnd(T data) {
        Node<T> newNode = new Node<T>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
    }

    public void DeleteFromBiginning() {
        if (head != null) {
            head = head.next;
            size--;
        } else {
            System.out.println("List is Empty !!");
        }
    }

    public void DeleteFromEnd() {
        if (head == null) {
            System.out.println("List is Empty !!");
        } else {
            if (head.next == null) {
                head = null;
            } else {
                Node<T> temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = null;
            }
            size--;

        }

    }

    public boolean Search(T data) {
        Node<T> temp = head;
        while (temp.next != null) {
            if (temp.data.equals(data)) {
                return true;
            }
        }
        return false;
    }

    public int Size() {
        return this.size;
    }

    public boolean IsEmpty() {
        return head == null;
    }

    public void Clear() {
        head = null;
        size = 0;
    }

    public void Display() {
        Node<T> temp = head;
        while (temp.next != null) {
            System.out.print(temp + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public void Reverse() {
        Node<T> previous = null, current = head, next;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
            head = previous;
        }
    }

}
