package Ch4.CircularQueue;

public class CircularQueue<T> {

    private T[] queue;
    private int front;
    private int rear;
    private int capacity;
    private int size;

    public CircularQueue(int capacity) {
        this.queue = (T[]) new Object[capacity];
        this.front = 0;
        this.rear = -1;
        this.capacity = capacity;
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public boolean isFull() {
        return this.size == capacity;
    }

    public int size() {
        return this.size;
    }

    public void enqueue(T item) {
        if (isFull()) {
            System.out.println("Circular Queue is Full !");
        } else {
            rear = (rear + 1) % capacity;
            queue[rear] = item;
            size++;
        }
    }

    public T dequeue() {
        T item = null;
        if (isEmpty()) {
            System.out.println("Circular Queue is Empty !");
        } else {
            item = queue[front];
            front = (front + 1) % capacity;
            size--;
        }
        return item;

    }

    public T peek() {
        T item = null;
        if (isEmpty()) {
            System.out.println("Circular Queue is Empty !");
        } else {
            item = queue[front];
        }
        return item;

    }

    public static void main(String[] args) {
        CircularQueue<String> names = new CircularQueue<>(5);
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
