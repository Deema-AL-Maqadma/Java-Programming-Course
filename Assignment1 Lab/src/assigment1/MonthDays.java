// Deema Mohammed AL-Maqadma
package assigment1;

public class MonthDays {

    private int month;
    private int year;

    public MonthDays(int m, int y) {
        month = m;
        year = y;
    }

    public int getNumberOfDays() {
        if (month == 2) {
            if ((year % 400 == 0 && year % 100 == 0) || (year % 4 == 0)) {
                return 29;
            } else {
                return 28;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            return 31;
        }
    }

}
