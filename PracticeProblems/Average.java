import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int number = scanner.nextInt();
            sum += number;
        }
        double average = sum / count;
        System.out.printf("The average is: %.2f%n", average);
        scanner.close();
    }
    
    
}
