
package Abistract;

public class Rectangle extends Shap{
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    

    @Override
    public double computeArea() {//Override for abstract method
        return length * width;
    }
    
    
}
