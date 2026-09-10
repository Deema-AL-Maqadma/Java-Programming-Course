package pkg2023200766deemaal.maqadma;

public class Treasure {

    private String name;
    private int count;

    public Treasure(String name) {
        this.name = name;
        this.count = 1;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public void incrementCount() {
        count++;
    }

    public void decrementCount() {
        if (count > 0) {
            count--;
        }
    }

    public String toString() {
        return name + ": " + count;
    }
}
