
package Inheritance.Q10;

public class CargoShip extends Ship {
    private int capacity;

    public CargoShip(int capacity, String name, String year) {
        super(name, year);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Name = "+super.getName()+"CargoShip{" + "capacity=" + capacity + '}';
    }
    
    
}
