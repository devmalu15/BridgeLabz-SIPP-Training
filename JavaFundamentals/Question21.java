import java.util.Scanner;
public class Question21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students (N): ");
        int numberOfStudents = input.nextInt();
        if (numberOfStudents < 0) {
            System.out.println("Number of students cannot be negative.");
        } else if (numberOfStudents < 2) {
            System.out.println("With " + numberOfStudents + " student(s), the maximum number of handshakes is 0.");
        } else {
            int numHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
            System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is " + numHandshakes);
        }
        input.close();
    }
}