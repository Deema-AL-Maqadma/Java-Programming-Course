package Ch4.SimpleQueue;

public class SimpleQueue<T> {

    public static class Node<T> {

        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
    Node<T> front;
    Node<T> rear;
    int size;

    public SimpleQueue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int size() {
        return this.size;
    }

    public void enqueue(T data) {
        Node<T> newNode = new Node(data);
        if (isEmpty()) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
        size++;
    }

    public T dequeue() {
        if (isEmpty()) {
            // System.out.println("Queue is Empty...");
            throw new IllegalStateException("Queue is Empty...");
        }
        T item = front.data;
        front = front.next;
        if (front == null) {
            return null;
        }
        size--;
        return item;
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty...");
        }
        return front.data;
    }

    public static void main(String[] args) {
        SimpleQueue<String> names = new SimpleQueue<>();
        names.enqueue("Ahmed");
        names.enqueue("DEEMA");
        names.enqueue("ZAIN");
        String name1 = names.dequeue();
        System.out.println("Front of Queue :" + name1);
        String newFront = names.peek();
        System.out.println("New Front of Queue :" + newFront);
        System.out.println("Queue is Empty :" + names.isEmpty());
        names.dequeue();
        names.dequeue();
        System.out.println("Queue is Empty :" + names.isEmpty());
    }
}
