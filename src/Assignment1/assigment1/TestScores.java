// Deema Mohammed AL-Maqadma
package assigment1;

public class TestScores {

    private double testScore1;
    private double testScore2;
    private double testScore3;

    public TestScores(double t1, double t2, double t3) {
        testScore1 = t1;
        testScore2 = t2;
        testScore3 = t3;
    }

    public TestScores() {
        testScore1 = 0.0;
        testScore2 = 0.0;
        testScore3 = 0.0;
    }

    public void setTestScore1(double t1) {
        testScore1 = t1;
    }

    public void setTestScore2(double t2) {
        testScore2 = t2;
    }

    public void setTestScore3(double t3) {
        testScore3 = t3;
    }

    public double getTestScore1() {
        return testScore1;
    }

    public double getTestScore2() {
        return testScore2;
    }

    public double getTestScore3() {
        return testScore3;
    }

    public double getAverage() {
        return (testScore1 + testScore2 + testScore3) / 3;
    }
}
