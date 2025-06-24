import java.util.Scanner;
public class Question24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        double celsiusResult = (fahrenheit - 32.0) * (5.0 / 9.0);
        System.out.println("The " + fahrenheit + " fahrenheit is " + String.format("%.2f", celsiusResult) + " celsius");
        input.close();
    }
}
