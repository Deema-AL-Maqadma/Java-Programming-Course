/** My Name : Deema Mohammed AL-Maqadma
 * ID : 2023200766
 *   --->>> GO A HERO !!!
 *  https://youtu.be/G_8lUuH0WFc?si=s_ePxm61j4eyruX0
Carpet Calculator رابط فيديو اليوتيوب
 */
package Deema.Ass3.CarpetCalculator;

public class RoomDimension {

    private double length;
    private double width;

    public RoomDimension(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return  "length = " + length
                + "\nwidth = " + width;
    }

}
/** My Name : Deema Mohammed AL-Maqadma
 * ID : 2023200766
 */