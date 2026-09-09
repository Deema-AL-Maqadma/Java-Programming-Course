// Deema Mohammed AL-Maqadma
package assigment1;

import java.util.Scanner;

public class CircleTest {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = k.nextDouble();

        Circle c = new Circle(radius);

        System.out.println("Area of the circle: " + c.getArea());
        System.out.println("Diameter of the circle: " + c.getDiameter());
        System.out.println("Circumference of the circle: " + c.getCircumference());

        k.close();
    }

}
