package Methods;
import java.util.Scanner;

public class Question1 {

  
    public double calculateWindChill(double temperature, double windSpeed) {
      
        return 35.74 + (0.6215 * temperature)
               - (35.75 * Math.pow(windSpeed, 0.16))
               + (0.4275 * temperature * Math.pow(windSpeed, 0.16));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Question1 calculator = new Question1();

        
        System.out.print("Enter temperature in Fahrenheit: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter wind speed in miles per hour: ");
        double windSpeed = scanner.nextDouble();

       
        if (temperature <= 50 && windSpeed >= 3) {
            double windChill = calculator.calculateWindChill(temperature, windSpeed);
            System.out.printf("Wind Chill Temperature: %.2f°F\n", windChill);
        } else {
            System.out.println("Wind chill formula is only valid for temperatures <= 50°F and wind speeds >= 3 mph.");
        }

        scanner.close();
    }
}
