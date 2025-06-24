import java.util.Scanner;
public class Question19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double TARGET_DISTANCE_KM = 5.0;
        final double TARGET_DISTANCE_METERS = TARGET_DISTANCE_KM * 1000.0;
        System.out.print("Enter the length of side 1 (meters): ");
        double side1 = input.nextDouble();
        System.out.print("Enter the length of side 2 (meters): ");
        double side2 = input.nextDouble();
        System.out.print("Enter the length of side 3 (meters): ");
        double side3 = input.nextDouble();
        double perimeter = side1 + side2 + side3;
        if (perimeter <= 0) {
            System.out.println("Invalid triangle dimensions or perimeter is zero. Cannot calculate rounds.");
        } else {
            double numRounds = TARGET_DISTANCE_METERS / perimeter;
            System.out.println("The total number of rounds the athlete will run is " + String.format("%.2f", numRounds) + " to complete " + TARGET_DISTANCE_KM + " km");
        }
        input.close();
    }
}