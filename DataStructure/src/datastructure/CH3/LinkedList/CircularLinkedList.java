package datastructure.CH3.LinkedList;

class CircularNode<T> {

    T data;
    CircularNode<T> next;

    public CircularNode(T data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularLinkedList<T> {

    private CircularNode<T> head;

    public void InsertAtBeginning(T data) {
        CircularNode<T> newNode = new CircularNode<T>(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            CircularNode<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
            head = newNode;

        }

    }

    public void InsertAtEnd(T data) {
        CircularNode<T> newNode = new CircularNode<T>(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            CircularNode<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;

        }

    }

    public void DeleteFromBiginning() {
        if (head != null) {
            if (head.next == null) {
                head = null;
            } else {
                CircularNode<T> temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                head = head.next;
                temp.next = head;
            }
        } else {
            System.out.println("List is Empty !!");
        }
    }

    public void DeleteFromEnd() {
        if (head == null) {
            System.out.println("List is Empty !!");
        } else {
            if (head.next == head) {
                head = null;
            } else {
                CircularNode<T> temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                CircularNode<T> prev = head;
                while (prev.next != null) {
                    prev = prev.next;
                }
                prev.next = head;
            }

        }
    }

    public void Display() {
        if (head != null) {
            CircularNode<T> temp = head;
            do {
                System.out.println("Data :" + temp.data);
                temp = temp.next;
            } while (temp != head);
            System.out.println("Back To The Head !!");
        } else {
            System.out.println("List is Empty !!");

        }

    }
}
