/** My Name : Deema Mohammed AL-Maqadmaديمة محمد أحمد المقادمة
 * University ID : 2320230766
 * Question (1) //
 */
package Assignment1.Q1;

public class Distance {

    private double feet;
    private double inches;

    public Distance() {
        feet = 0.0;
        inches = 0.0;
    }

    public Distance(double f, double i) {
        feet = f;
        inches = i;
    }

    public Distance(Distance object) {
        feet = object.feet;
        inches = object.inches;
        System.out.println("The copy feet = " + feet
                + "The copy inches = " + inches);

    }

    public String toString() {
        return "The feet = " + feet
                + "\n The inches = " + inches;
    }
}

/** My Name : Deema Mohammed AL-Maqadmaديمة محمد أحمد المقادمة     
 * University ID : 2320230766
 * Question (1) //
 */
