// Deema Mohammed AL-Maqadma
package assigment1;

import java.util.Scanner;

public class TestScoresTest {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter first test score: ");
        double score1 = s.nextDouble();

        System.out.print("Enter second test score: ");
        double score2 = s.nextDouble();

        System.out.print("Enter third test score: ");
        double score3 = s.nextDouble();

        TestScores t = new TestScores(score1, score2, score3);

        System.out.println("Average test score: " + t.getAverage());

        s.close();
    }

}
