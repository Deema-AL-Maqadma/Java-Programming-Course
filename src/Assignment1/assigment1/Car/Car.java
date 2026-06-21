    // Deema Mohammed AL-Maqadma
package assigment1.Car;

public class Car {

    private int yearModel;
    private String make;
    private int speed;

    public Car(int ym, String m) {
        yearModel = ym;
        make = m;
        speed = 0;
    }

    public int getYearModel() {
        return yearModel;
    }

    public String getMake() {
        return make;
    }

    public int getSpeed() {
        return speed;
    }

    public void accelerate() {
        speed += 5;
    }

    public void brake() {
        speed -= 5;
        if (speed < 0) {
            speed = 0;
        }
    }
}
