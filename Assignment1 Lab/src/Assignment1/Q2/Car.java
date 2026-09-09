/** My Name : Deema Mohammed AL-Maqadmaديمة محمد أحمد المقادمة
 * University ID : 2320230766
 * Question (2) //
 */
package Assignment1.Q2;

public class Car {

    private String model;
    private String year;
    private double price;

    public Car(String m, String y, double p) {
        model = m;
        year = y;
        price = p;
    }

    public void setModel(String m) {
        model = m;
    }

    public void setYear(String y) {
        year = y;
    }

    public void setPrice(double p) {
        if (p == 0) {
            price = p;
        } else {
            System.out.println("Error");
        }
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    /**
     * My Name : Deema Mohammed AL-Maqadmaديمة محمد أحمد المقادمة University ID
     * : 2320230766 Question (2) //
     */
}
