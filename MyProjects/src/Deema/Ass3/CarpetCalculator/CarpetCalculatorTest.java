/** My Name : Deema Mohammed AL-Maqadma
 * ID : 2023200766
 *   --->>> GO A HERO !!!
 * https://youtu.be/G_8lUuH0WFc?si=s_ePxm61j4eyruX0
Carpet Calculator رابط فيديو اليوتيوب

 */
package Deema.Ass3.CarpetCalculator;

import java.util.Scanner;

public class CarpetCalculatorTest {

    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);
        System.out.println("-----> Wellcom to Carpet Calculator <-----");

        System.out.print("-> Enter the length of the Room (in foot) : ");
        double length = k.nextDouble();
        System.out.print("-> Enter the width of the Room (in foot) : ");
        double width = k.nextDouble();

        RoomDimension room = new RoomDimension(length, width);
        System.out.print("-> Enter the cost of the carpet per square foot : ");
        double cost = k.nextDouble();

        RoomCarpet carpet = new RoomCarpet(room, cost);
        System.out.println(" -----> The Room Carpet Details <----- ");
        System.out.println(carpet);
        // System.out.println(carpet.toString());
        System.out.println(" \nThx ^_^ ");

    }

}
/**
 * My Name : Deema Mohammed AL-Maqadma ID : 2023200766
 */
