package Inheritance.CallingSuperClassConstructor;

import java.util.Scanner;

public class CubeTest {

    public static void main(String[] args) {

        double Length, Width, Height;
        Scanner k = new Scanner(System.in);
        System.out.println("Enter the following dimonctins if a cube :");
        System.out.print("Length =");
        Length = k.nextDouble();
        System.out.print("Width =");
        Width = k.nextDouble();
        System.out.print("Height =");
        Height = k.nextDouble();

        Cube myCube = new Cube(Length, Width, Height);

        System.out.println("---> Here are the cube's properties ...");
        System.out.println("Length : " + myCube.getLength());
        System.out.println("Width : " + myCube.getWidth());
        System.out.println("Height : " + myCube.getHeight());
        System.out.println("Base Area : " + myCube.getArea());
        System.out.println("Surfase Area : " + myCube.getSurfaceArea());
        System.out.println("Volume : " + myCube.getVolume());

    }

}
