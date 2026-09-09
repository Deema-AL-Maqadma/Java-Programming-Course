package datastructure.CH3;

public class Bag<T> {

    private T items[];
    private int capacity;
    private int size;

    public Bag(int capacity) {
        this.capacity = capacity;
        this.items = (T[]) new object[capacity];
        this.size = 0;
    }

    public boolean IsFull() {
        return size == capacity;
    }

    public boolean IsEmpty() {
        return size == 0;
    }

    public void AddItem(T item) {
        this.items[size] = item;
        size++;
    }

    public void Add(T item) {
        if (IsFull()) {
            System.out.println("sorry, Array is full !");
            return;
        } else {
            AddItem(item);
            System.out.println("* Add successfully *");
        }
    }

    public int Size() {
        return this.size;
    }

    public void Display() {
        for (int i = 0; i < size; i++) {
            System.out.println("Item :" + items[i]);
        }
    }

    public boolean Contains(T item) {
        boolean isFound = false;
        if (!IsEmpty()) {
            for (int i = 0; i < size; i++) {
                if (items[i] == item) {
                    isFound = true;
                    break;
                }
            }
        }
        return isFound;
    }

    public int IndexOf(T item) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (items[i] == item) {
                index = i;
            }
        }
        return index;
    }

    public void remove(T item) {
        if (!IsEmpty()) {
            int index = IndexOf(item);
            if (index != -1) {
                for (int i = 0; i < size - 1; i++) {
                    this.items[i] = this.items[i - 1];
                }
                size--;
            } else {
                System.out.println("* Element is not found ! * ");
            }
        } else {
            System.out.println("sorry, Bag is empty !");
        }

    }

    public T get(int index) {
        if (!IsEmpty() && index >= 0 && index < size) {
            for (int i = 0; i < size - 1; i++) {
                if (items[i] == items[index]) {
                    return items[index];
                }
            }
        }
        return null;
    }

    public void removeAt(int index) {
        T item = get(index);
        if (item != null) {
            remove(item);
        } else {
            System.out.println("* index Invalid *");
        }
    }

    private static class object {

        public object() {
        }
    }
}
