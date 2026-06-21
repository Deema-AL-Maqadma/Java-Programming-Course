// Deema Mohammed AL-Maqadma
package Assigment2;

public class Circle {
   
 private double radius;
 public Circle(double r)
 {
 radius = r;
 }
 public double getArea()
 {
 return Math.PI * radius * radius;
 }
 public double getRadius()
 {
 return radius;
 }
 public String toString(){
     return "Circle [radius = "+radius
             +"Area = "+getArea()+"]";
 }
 public boolean aquals(Object obj){
     boolean status = false;
     if(this==obj){
         status= true;
     }else{
         status= false;
     }
     return status;
 }
 public boolean GreaterThan(Circle newCircle){
     return this.getArea()> newCircle.getArea();
 }

    
}
