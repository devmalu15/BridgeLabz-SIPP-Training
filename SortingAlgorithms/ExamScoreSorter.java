import java.util.Scanner;

public class ExamScoreSorter {
    public static void selectionSort(int[] scores) {
        int n = scores.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int n = sc.nextInt();

        int[] scores = new int[n];
        System.out.println("Enter the scores of " + n + " students: ");
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }
        selectionSort(scores);
        System.out.println("Sorted scores in ascending order:");
        for (int score : scores) {
            System.out.print(score + " ");
        }
    }
}