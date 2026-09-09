package Inheritance.Overriding;

public class SuperClass {

    // overloading betwen two method inside the same class
    public void showValue(int arg) {//Overriding betwen two method inside the SuperClass & SubClass
        System.out.println("SuperClass : The int argument = " + arg);
    }

    public void showValue(String arg) {
        System.out.println("SuperClass : The String argument = " + arg);
    }

}
