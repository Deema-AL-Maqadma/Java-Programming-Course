package Circle;

public class Circle {

    private double radius;
    private String color;

    // No argument Constructor
    public Circle() {
    }

    // Multi argument Constructor (with radius and color)
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Getters and Setters
    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Calculate area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Calculate circumference
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // toString method
    @Override
    public String toString() {
        return "--->>> Circle Details :"
                + "\nRadius=" + this.radius + "\nColor=" + this.color
                + "\nArea=" + this.getArea()
                + "\nCircumference=" + this.getCircumference() ;
    }
}
