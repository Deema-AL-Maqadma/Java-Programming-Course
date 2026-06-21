// Deema Mohammed AL-Maqadma
package assigment1;

public class Payroll {

    private String employeeName;
    private int idNumber;
    private double hourlyPayRate;
    private double hoursWorked;

    public Payroll(String e, int i) {
        employeeName = e;
        idNumber = i;
        hourlyPayRate = 0.0;
        hoursWorked = 0.0;
    }

    public void setEmployeeName(String e) {
        employeeName = e;
    }

    public void setIdNumber(int i) {
        idNumber = i;
    }

    public void setHourlyPayRate(double hp) {
        hourlyPayRate = hp;
    }

    public void setHoursWorked(double hw) {
        hoursWorked = hw;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getGrossPay() {
        return hourlyPayRate * hoursWorked;
    }

}
