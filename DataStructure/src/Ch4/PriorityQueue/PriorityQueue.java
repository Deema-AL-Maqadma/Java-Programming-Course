package Ch4.PriorityQueue;

public class PriorityQueue<T> {

    private class Node<T> {

        T data;
        int priority;
        Node<T> next;

        public Node(T data, int pri) {
            this.data = data;
            this.priority = pri;
            this.next = null;
        }
    }
    private Node<T> head;

    public PriorityQueue() {
        this.head = null;
    }

    public void add(T item, int pri) {
        Node<T> newNode = new Node(item, pri);
        if (head == null || pri < head.priority) {
            newNode.next = head;
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null && current.next.priority <= pri) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public T POLL() {
        if (isEmpty()) {
            System.out.println("PriorityQueue is Empty...");
            return null;
        }
        T data = this.head.data;
        head = head.next;
        return data;

    }

    public T Peek() {
        if (isEmpty()) {
            System.out.println("PriorityQueue is Empty...");
            return null;
        }

        return head.data;
    }

    public static void main(String[] args) {
        PriorityQueue<String> colors = new PriorityQueue<>();
        colors.add("red", 0);
        colors.add("blue", 2);
        System.out.println("Head :" + colors.Peek());
        colors.add("black", -1);
        System.out.println("Head :" + colors.Peek());
        colors.POLL();
        System.out.println("Head :" + colors.Peek());

    }
}
