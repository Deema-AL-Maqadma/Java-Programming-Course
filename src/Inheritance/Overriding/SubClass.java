package Inheritance.Overriding;

public class SubClass extends SuperClass {

    public void showValue(int arg) {//Overriding betwen two method inside the SuperClass & SubClass
        System.out.println("SubClass : The int argument = " + arg);
    }

    public void showValue(double arg) {
        System.out.println("SubClass : The double argument = " + arg);
    }

}
