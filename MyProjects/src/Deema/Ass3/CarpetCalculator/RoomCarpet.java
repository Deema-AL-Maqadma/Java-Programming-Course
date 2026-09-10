/** My Name : Deema Mohammed AL-Maqadma
 * ID : 2023200766
 *   --->>> GO A HERO !!!
 *  https://youtu.be/G_8lUuH0WFc?si=s_ePxm61j4eyruX0
Carpet Calculator رابط فيديو اليوتيوب
 */
package Deema.Ass3.CarpetCalculator;

public class RoomCarpet {

    private RoomDimension size; //Aggregation 
    private double carpetCost;

    public RoomCarpet(RoomDimension size, double carpetCost) {
        this.size = size;
        this.carpetCost = carpetCost;
    }

    public double getTotalCost() {
        return size.getArea() * carpetCost;
    }

    @Override
    public String toString() {
        return size.toString()
                + "\ncarpet Cost = " + carpetCost
                + "\n -----> The Total Cost of Carpet = " + getTotalCost()+" $";
    }

}
/** My Name : Deema Mohammed AL-Maqadma
 * ID : 2023200766
 */
