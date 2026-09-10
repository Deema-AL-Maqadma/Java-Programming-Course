/**
 * My Name : Deema Mohammed AL-Maqadma ID : 2023200766
 */
package MedicalClinicManagementSystem;

import java.util.Date;

public class Manager extends Employee implements serializable {

    private double managerBonus;

    public Manager() {
    }

    public Manager(double managerBonus, double basicSalary, double liveExpensive, Date hireDate, String name, String id, String address, String phoneNumber, String email, String gender) {
        super(basicSalary, liveExpensive, hireDate, name, id, address, phoneNumber, email, gender);
        this.managerBonus = managerBonus;
    }

    public double getManagerBonus() {
        return managerBonus;
    }

    public void setManagerBonus(double managerBonus) {
        this.managerBonus = managerBonus;
    }

    @Override
    public double getSalary() { //Override for Abstract method
        return getBasicSalary() + getLiveExpensive() + managerBonus;
    }

}
/**
 * My Name : Deema Mohammed AL-Maqadma ID : 2023200766
 */
