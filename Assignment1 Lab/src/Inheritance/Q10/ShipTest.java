package Inheritance.Q10;

public class ShipTest {

    public static void main(String[] args) {
        Ship[] s = new Ship[3];
        s[0] = new Ship("Deema", "2005");
        s[1] = new CruiseShip(20, "Ahmed", "2008");
        s[2] = new CargoShip(30, "Omar", "2010");

        for (Ship a : s) {
            System.out.println(a);
        }

    }

}
