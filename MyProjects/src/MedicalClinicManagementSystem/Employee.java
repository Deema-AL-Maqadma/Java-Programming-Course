/**
 * My Name : Deema Mohammed AL-Maqadma ID : 2023200766
 */
package MedicalClinicManagementSystem;

import java.util.Date;

public abstract class Employee extends Person implements serializable { //Abstract CLASS , SubClass

    private double basicSalary, liveExpensive;
    private Date hireDate;

    public Employee() {
    }

    public Employee(double basicSalary, double liveExpensive, Date hireDate, String name, String id, String address, String phoneNumber, String email, String gender) {
        super(name, id, address, phoneNumber, email, gender); //call person constructor
        this.basicSalary = basicSalary;
        this.liveExpensive = 0.055 * basicSalary;
        this.hireDate = hireDate;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getLiveExpensive() {
        return liveExpensive;
    }

    public void setLiveExpensive(double liveExpensive) {
        this.liveExpensive = liveExpensive;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "--->> Employee : \n"
                + "\nBasicSalary=" + basicSalary
                + "\nLiveExpensive=" + liveExpensive
                + "\nHireDate=" + hireDate;
    }

    public abstract double getSalary(); //Abstract method

}
/**
 * My Name : Deema Mohammed AL-Maqadma ID : 2023200766
 */
