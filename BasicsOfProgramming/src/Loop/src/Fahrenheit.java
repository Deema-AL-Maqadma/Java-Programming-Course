package Loop.src;

import java.util.Scanner;

public class Fahrenheit {

    public static void main(String[] args) {
        double fahrenheit;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter fahrenheit : ");
        fahrenheit = keyboard.nextInt();
        double celsius;
        celsius = (fahrenheit - 32 * (5 / 9));
        System.out.println(celsius);

        System.out.println('E' + 'M');
        int x = 5;
        int y = 2;
        double c = x / y;
        System.out.print(c);

    }
}
