import java.util.Scanner;
public class Question28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = input.nextDouble();
        double fahrenheitResult = (celsius * (9.0 / 5.0)) + 32.0;
        System.out.println("The " + celsius + " celsius is " + String.format("%.2f", fahrenheitResult) + " fahrenheit");
        input.close();
    }
}