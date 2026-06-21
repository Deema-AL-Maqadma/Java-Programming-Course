package Abistract;

public class ShapTest {

    public static void main(String[] args) {
        Rectangle s = new Rectangle(6, 6);// object 
        //   Shap x = new Shap(20, 3); //can't make object form abstract class
        Shap x = new Rectangle(20, 3); // object for concrate class
        double value = s.computeArea();
        System.out.println("The Area of Rectangle = " + value);

    }

}
