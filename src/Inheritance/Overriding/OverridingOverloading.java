package Inheritance.Overriding;

public class OverridingOverloading {

    public static void main(String[] args) {
        SubClass myObject = new SubClass();
        myObject.showValue(25); // pass an int ينفذ ما بداخل الsupClass
        myObject.showValue(25.5);// pass an double ينفذ ما بداخل الsupClass
        myObject.showValue("DEEMA");// pass an string ينفذ ما بداخل الsuperClass

    }
}
