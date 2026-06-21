/** My Name : Deema Mohammed AL-Maqadmaديمة محمد أحمد المقادمة
 * University ID : 2320230766
 * Question (2) //
 */
package Assignment1.Q2;

public class CarTest {

    public static void main(String[] args) {
        Car c1 = new Car("BMW", "2025", 95000);
        Car c2 = new Car("kia", "2000", 65000);

        System.out.println(c1.getPrice());
        System.out.println(c2.getPrice());

        double p1 = c1.getPrice() * 0.05;
        double p2 = c2.getPrice() * 0.07;

        System.out.print("The Price after the 5% discount = " + p1);
        System.out.println("The Price after the 7% discount = " + p2);
    }

}

/**
 * My Name : Deema Mohammed AL-Maqadmaديمة محمد أحمد المقادمة University ID :
 * 2320230766 Question (2) //
 */
