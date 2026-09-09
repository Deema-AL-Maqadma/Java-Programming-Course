package datastructure.CH3.LinkedList;

class Node<T> {

    T data;
    Node<T> next;
    Node<T> prev;

    public Node(T data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DoublelyLinkedList<T> {

    private Node<T> head;
    private int size;

    public void InsertAtBeginning(T data) {
        Node<T> newNode = new Node<T>(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
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
            newNode.prev = temp;
        }
        size++;
    }

    public void DeleteFromBiginning() {
        if (head != null) {
            if (head.next != null) {
                head.next.prev = null;
            }
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
                temp.prev.next = null;
            }
            size--;

        }
    }

    public boolean Search(T data) {
        Node<T> temp = head;
        while (temp != null) {
            if (temp.data.equals(data)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int Size() {
        return this.size;
    }

    public boolean IsEmpty() {
        return size == 0;
    }

    public void Display() {
        Node<T> temp = head;
        while (temp.next != null) {
            System.out.print("Data : " + temp.next + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public void Reverse() {
        Node<T> temp = null, current = head;
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
    }

    public void DisplayReverse() {
        Node<T> temp = head;
        if (IsEmpty()) {
            return;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        while (temp != null) {
            System.out.print("Data : " + temp.next + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

}
