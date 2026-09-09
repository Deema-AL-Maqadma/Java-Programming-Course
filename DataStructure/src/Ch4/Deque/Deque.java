package Ch4.Deque;

public class Deque<T> {

    private class Node<T> {

        T data;
        Node<T> next;
        Node<T> prev;

        public Node(T item) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    private Node<T> front;
    private Node<T> rear;
    private int size;

    public Deque() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void addFirst(T item) {
        Node<T> newNode = new Node<>(item);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            newNode.next = front;
            front.prev = newNode;
            front = newNode;
        }
        size++;
    }

    public void addLast(T item) {
        Node<T> newNode = new Node<>(item);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            newNode.prev = rear;
            rear.next = newNode;
            rear = newNode;
        }
        size--;
    }

    public T removeFirst() {
        if (isEmpty()) {
            System.out.println("Deque is Empty..!");
            return null;
        } else {
            T data = front.data;
            front = front.next;
            if (front == null) {
                rear = null;
            } else {
                front.prev = null;
            }
            size--;
            return data;
        }
    }

    public T removeLast() {
        if (isEmpty()) {
            System.out.println("Deque is Empty..!");
            return null;
        } else {
            T data = rear.data;
            rear = rear.prev;
            if (rear == null) {
                front = null;
            } else {
                rear.next = null;
            }
            size--;
            return data;
        }
    }

    public T peekFirst() {
        if (isEmpty()) {
            System.out.println("Deque is Empty..!");
            return null;
        } else {
            return front.data;
        }
    }

    public T peekLast() {
        if (isEmpty()) {
            System.out.println("Deque is Empty..!");
            return null;
        } else {
            return rear.data;
        }

    }

    public int size() {
        return this.size;
    }

    public static void main(String[] args) {
        Deque<String> name = new Deque<>();
        name.peekFirst();
        name.peekLast();
        name.addFirst(" MOHAMMED");
        name.addFirst("DEEMA");
        name.addLast(" AL-MAQADMA");
        //name.peekFirst();
        name.peekLast();

    }
}
