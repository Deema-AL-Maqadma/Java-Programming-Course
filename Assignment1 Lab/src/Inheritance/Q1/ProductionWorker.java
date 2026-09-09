package Inheritance.Q1;

public class ProductionWorker extends Employee {

    private static final int Day_shift = 1;
    private static final int Night_shift = 0;
    private int shift;
    private double Hourly_pay_rate;

    public ProductionWorker() {
    }

    public ProductionWorker(int shift, double Hourly_pay_rate, String name, String number, String Hair_date) {
        super(name, number, Hair_date);
        this.shift = shift;
        this.Hourly_pay_rate = Hourly_pay_rate;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public double getHourly_pay_rate() {
        return Hourly_pay_rate;
    }

    public void setHourly_pay_rate(double Hourly_pay_rate) {
        this.Hourly_pay_rate = Hourly_pay_rate;
    }

    @Override
    public String toString() {
        String str = super.toString() + "\nProductionWorker{" + "shift=";
        if (shift == Day_shift) {// للتحقق من شرط الشفت صباحي او مسائي
            str += "Day_shift";
        } else if (shift == Night_shift) {
            str += "Night_shift";
        }
        str += ", Hourly_pay_rate=" + Hourly_pay_rate + '}';
        return str;
    }

}
