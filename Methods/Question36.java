package Methods;
import java.util.Scanner;
import java.util.Random;

public class Question36 {

    public static int[][] generateRandomScores(int numberOfStudents) {
        int[][] scores = new int[numberOfStudents][3]; // [Physics, Chemistry, Math]
        Random rand = new Random();
        for (int i = 0; i < numberOfStudents; i++) {
            scores[i][0] = rand.nextInt(41) + 60; // Random 2-digit scores (60 to 100)
            scores[i][1] = rand.nextInt(41) + 60;
            scores[i][2] = rand.nextInt(41) + 60;
        }
        return scores;
    }

    public static double[][] calculateTotalAvgPercent(int[][] scores) {
        int n = scores.length;
        double[][] result = new double[n][3]; // [Total, Average, Percentage]
        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percent = (total / 300.0) * 100;

            result[i][0] = total;
            result[i][1] = Math.round(average * 100.0) / 100.0;
            result[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return result;
    }

    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("ID\tPhysics\tChemistry\tMaths\tTotal\tAverage\t\tPercentage");
        for (int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "\t" + scores[i][0] + "\t" + scores[i][1] + "\t\t" + scores[i][2] + "\t");
            System.out.print((int) results[i][0] + "\t");
            System.out.print(results[i][1] + "\t\t" + results[i][2] + "%");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] scores = generateRandomScores(n);
        double[][] results = calculateTotalAvgPercent(scores);
        displayScorecard(scores, results);

        sc.close();
    }
}
