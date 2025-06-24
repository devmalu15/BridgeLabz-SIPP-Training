import java.util.Scanner;
public class Question10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double CM_PER_INCH = 2.54;
        final int INCHES_PER_FOOT = 12;
        System.out.print("Enter your height in centimeters: ");
        double heightCm = input.nextDouble();
        double totalInches = heightCm / CM_PER_INCH;

        int feet = (int) (totalInches / INCHES_PER_FOOT);
        double remainingInches = totalInches % INCHES_PER_FOOT;
        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + String.format("%.2f", remainingInches));
        input.close();
    }
}