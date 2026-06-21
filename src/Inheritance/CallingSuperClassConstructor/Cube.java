package Inheritance.CallingSuperClassConstructor;

public class Cube extends Rectangle { // sub class

    private double height;
//للمناداة على كونستركتر الاب وينفذهsuper ويجب استخدام كلمة inhereance لا تخص الكلاس يكون نتيجة علاقة arg وجود متغيرات في

    public Cube(double length, double width, double height) {
        // calling the super class constructor
        super(length, width);// نمرر القيم لكونستركتر السوبر لينفذه
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getSurfaceArea() { // لاحضار مساحة المكعب
        return getArea() * 6;
    }

    public double getVolume() { //لاحضار حجم المكعب
        return getArea() * height;
    }

}
