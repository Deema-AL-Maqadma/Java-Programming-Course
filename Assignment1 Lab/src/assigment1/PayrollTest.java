// Deema Mohammed AL-Maqadma
package assigment1;

import java.util.Scanner;

public class PayrollTest {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        System.out.print("Enter employee's name: ");
        String name = k.nextLine();

        System.out.print("Enter employee's ID number: ");
        int id = k.nextInt();

        Payroll employee = new Payroll(name, id);

        System.out.print("Enter hourly pay rate: ");
        double hourlyRate = k.nextDouble();
        employee.setHourlyPayRate(hourlyRate);

        System.out.print("Enter number of hours worked: ");
        double hours = k.nextDouble();
        employee.setHoursWorked(hours);

        System.out.println("Employee's Gross Pay: $" + employee.getGrossPay());

        k.close();
    }

}
