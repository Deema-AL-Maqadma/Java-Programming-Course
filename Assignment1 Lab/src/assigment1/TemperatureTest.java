// Deema Mohammed AL-Maqadma
package assigment1;

import java.util.Scanner;

public class TemperatureTest {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a temperature in Fahrenheit: ");
        double fahrenheit = s.nextDouble();

        Temperature temp = new Temperature(fahrenheit);

        System.out.println("Temperature in Fahrenheit: " + temp.getFahrenheit() + "°F");
        System.out.println("Temperature in Celsius: " + temp.getCelsius() + "°C");
        System.out.println("Temperature in Kelvin: " + temp.getKelvin() + " K");

        s.close();
    }
}
