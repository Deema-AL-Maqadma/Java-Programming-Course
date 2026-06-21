// Deema Mohammed AL-Maqadma
package assigment1;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee e1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
        Employee e2 = new Employee("Mark Jones", 39119, "IT", "Programmer");
        Employee e3 = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");

        displayEmployee(e1);
        displayEmployee(e2);
        displayEmployee(e3);
    }
    public static void displayEmployee(Employee e) {
        System.out.println("Name: " + e.getName());
        System.out.println("ID Number: " + e.getIdNumber());
        System.out.println("Department: " + e.getDepartment());
        System.out.println("Position: " + e.getPosition());
        System.out.println();
    }

}
