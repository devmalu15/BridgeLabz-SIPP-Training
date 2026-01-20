import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter principal amount: %n");
        int priciple = scanner.nextInt();
        System.out.println("Enter rate of interest: ");
        int rate = scanner.nextInt();
        System.out.println("Enter time in years: ");
        int time = scanner.nextInt();

        double simpleInterest = (priciple * rate * time) / 100.0;
        System.out.printf("Simple Interest is: %.2f%n", simpleInterest);

        scanner.close();
    }
}
