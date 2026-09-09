package Loop.src;

        // The Works of Wolfgang

public class Main {

    public static void main(String[] args) {
        int y = 8, x = 9;
        if (y == 0) {
            x = 100;
        } else {
            x = 1;
        }
        System.out.println(x);
        double value = 12345.678;
        System.out.printf("%.2f\n", value);

        int grade = 102;
        if (grade <= 0 || grade >= 100) {
            System.out.println(" The number is not grade");
        }
        int k = 1;
        do {
            System.out.println(k);
            System.out.println("* ");
            x++;
        } while (k == 5);
        int z;
        for (z = 3; z <= 8; z++) {
            System.out.println(z);
        }
    }

}
