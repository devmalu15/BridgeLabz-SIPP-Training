package Methods;
import java.util.Scanner;

public class Question37 {

    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.round(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)) * 100.0) / 100.0;
    }

    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1); // slope
        double b = y1 - m * x1; // y-intercept
        m = Math.round(m * 100.0) / 100.0;
        b = Math.round(b * 100.0) / 100.0;
        return new double[] { m, b };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();

        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.println("\nEuclidean Distance = " + distance);

        if (x1 == x2) {
            System.out.println("The line is vertical, slope is undefined.");
            System.out.println("Equation: x = " + x1);
        } else {
            double[] equation = findLineEquation(x1, y1, x2, y2);
            System.out.println("Slope (m): " + equation[0]);
            System.out.println("Y-Intercept (b): " + equation[1]);
            System.out.println("Equation of the Line: y = " + equation[0] + "x + " + equation[1]);
        }

        scanner.close();
    }
}
