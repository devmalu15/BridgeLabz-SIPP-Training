import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        double km = scanner.nextDouble();
        double mile = km / 1.6;
        System.out.println("The total miles is " + mile + " miles for the given " + km + " km");
        scanner.close();
    }
    
}
