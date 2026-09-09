package Inheritance.Q1;

public class Employee {

    private String name, number, Hair_date;

    public Employee() {
    }

    public Employee(String name, String number, String Hair_date) {
        this.name = name;
        setNumber(number);// عشان يفحص شرط الرقم عندتدخاله من قبل الكونستركتر
        this.Hair_date = Hair_date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) { // شرط الرقم ان يكون حسب الفورم XXX-L
        if (number.length() == 5) {
            if (Character.isDigit(number.charAt(0))
                    && Character.isDigit(number.charAt(1))
                    && Character.isDigit(number.charAt(2))
                    && number.charAt(3) == '-'
                    && Character.isLetter(number.charAt(4))
                    && number.charAt(4) >= 'A'
                    && number.charAt(4) <= 'M') {
                this.number = number;
            } else {
                this.number = "Invalid number";
            }

        } else {
            this.number = "Invalid number";
        }
    }

    public String getHair_date() {
        return Hair_date;
    }

    public void setHair_date(String Hair_date) {
        this.Hair_date = Hair_date;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", number=" + number + ", Hair_date=" + Hair_date + '}';
    }

}
