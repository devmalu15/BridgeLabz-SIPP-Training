import java.util.*;

public class Question11{
    public static int[][] generateScores(int numberOfStudents) {
        Random random = new Random();
        int[][] scores = new int[numberOfStudents][3];
        for (int i = 0; i < numberOfStudents; i++) {
            scores[i][0] = random.nextInt(90) + 10;
            scores[i][1] = random.nextInt(90) + 10;
            scores[i][2] = random.nextInt(90) + 10;
        }
        return scores;
    }
    public static double[][] calculateTotals(int[][] scores) {
        int n = scores.length;
        double[][] result = new double[n][3];
        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percentage = (total / 300.0) * 100;
            result[i][0] = total;
            result[i][1] = Math.round(avg * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return result;
    }
    public static String[] calculateGrades(double[][] stats) {
        String[] grades = new String[stats.length];
        for (int i = 0; i < stats.length; i++) {
            double percentage = stats[i][2];
            if (percentage >= 80)
                grades[i] = "A";
            else if (percentage >= 70)
                grades[i] = "B";
            else if (percentage >= 60)
                grades[i] = "C";
            else if (percentage >= 50)
                grades[i] = "D";
            else if (percentage >= 40)
                grades[i] = "E";
            else
                grades[i] = "R";
        }
        return grades;
    }
    public static void displayScorecard(int[][] scores, double[][] stats, String[] grades) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-15s %-10s\n",
                "Student", "Physics", "Chemistry", "Maths", "Total", "Average", "Percentage", "Grade");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.0f %-10.2f %-15.2f %-10s\n",
                    (i + 1), scores[i][0], scores[i][1], scores[i][2],
                    stats[i][0], stats[i][1], stats[i][2], grades[i]);
        }
    }
    public static void main(String[] args) {
        int numberOfStudents = 5;
        int[][] scores = generateScores(numberOfStudents);
        double[][] stats = calculateTotals(scores);
        String[] grades = calculateGrades(stats);
        displayScorecard(scores, stats, grades);
    }
}
