    // Deema Mohammed AL-Maqadma
package assigment1.Car;

public class CarTest {

    public static void main(String[] args) {

        Car myCar = new Car(2022, "Toyota");

        for (int i = 0; i < 5; i++) {
            myCar.accelerate();
            System.out.println("Current speed after accelerating: " + myCar.getSpeed() + " km/h");
        }

        for (int i = 0; i < 5; i++) {
            myCar.brake();
            System.out.println("Current speed after braking: " + myCar.getSpeed() + " km/h");
        }
    }

}
