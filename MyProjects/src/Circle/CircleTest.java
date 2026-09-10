/** My Name : Deema Mohammed AL-Maqadma
 * ID : 2023200766
 * ( The implementation of circle class )
 *   --->>> GO A HERO !!!
 */
package Circle;

import java.util.ArrayList;

public class CircleTest {
    public static void main(String[] args) {
        // Create ArrayList to store Circle objects
        ArrayList<Circle> my_circles = new ArrayList<>();

        // Create two circle objects & set properties
        Circle c1 = new Circle(3.0,"Black");
        Circle c2 = new Circle();
        c2.setRadius(2.0);
        c2.setColor("Blue");
        
        // Add the two circle objects to the ArrayList
        my_circles.add(c1);
        my_circles.add(c2);

        // Loop through the ArrayList and print each circle's information
        for (int i = 0; i < my_circles.size(); i++) {
            Circle currentCircle = my_circles.get(i);
            System.out.println("--->>> Circle Number ["+ (i+1) +"] <<<---");
            System.out.println(currentCircle.toString());
            System.out.println("\n************************************************\n");
        }
        System.out.println("--->>> Deema Thx U ^_^ <<<--- \n");
    }
}
    

