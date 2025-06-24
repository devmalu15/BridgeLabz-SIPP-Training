import java.util.Scanner;
public class Question12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double CM_PER_INCH = 2.54;
        System.out.print("Enter the base of the triangle in cm: ");
        double baseCm = input.nextDouble();
        System.out.print("Enter the height of the triangle in cm: ");
        double heightCm = input.nextDouble();
        double areaSqCm = 0.5 * baseCm * heightCm;

        double baseInch = baseCm / CM_PER_INCH;
        double heightInch = heightCm / CM_PER_INCH;
        double areaSqInch = 0.5 * baseInch * heightInch;
        System.out.println("The Area of the triangle in sq in is " + String.format("%.2f", areaSqInch) + " and sq cm is " + String.format("%.2f", areaSqCm));
        input.close();
    }
}
