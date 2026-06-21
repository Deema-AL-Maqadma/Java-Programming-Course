
package Inheritance.Q10;

public class CruiseShip extends Ship {
    private int maximum;

    public CruiseShip(int maximum, String name, String year) {
        super(name, year);
        this.maximum = maximum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    @Override
    public String toString() {// super.getName()لطباعة قيمة الاسم من السوبر فقط من خلال 
        return "Name = "+ super.getName()+"CruiseShip{" + "maximum=" + maximum + '}';
    }
    
    
}
