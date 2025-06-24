import java.util.Scanner;
public class Question25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Principal amount: ");
        double principal = input.nextDouble();
        System.out.print("Enter the Annual Interest Rate (%): ");
        double rate = input.nextDouble();
        System.out.print("Enter the Time period (years): ");
        double time = input.nextDouble();
        double simpleInterest = (principal * rate * time) / 100.0;
        System.out.println("The Simple Interest is " + String.format("%.2f", simpleInterest) +
                           " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
        input.close();
    }
}
