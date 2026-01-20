import java.util.Scanner;
public class Question27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double POUNDS_PER_KG = 2.20462;
        System.out.print("Enter the weight of the person in pounds: ");
        double weightPounds = input.nextDouble();
        double weightKg = weightPounds / POUNDS_PER_KG;
        System.out.println("The weight of the person in pounds is " + weightPounds + " and in kg is " + String.format("%.2f", weightKg));
        input.close();
    }
}