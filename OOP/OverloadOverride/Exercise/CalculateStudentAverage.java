package OOP.OverloadOverride.Exercise;
public class CalculateStudentAverage {
    static void average(String name, int... scores) {
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        double average = (double) total / scores.length;
        System.out.println(name + "'s average: " + average);
    }
}