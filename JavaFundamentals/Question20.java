import java.util.Scanner;
public class Question20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double MILES_TO_KM_FACTOR = 1.60934;
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your starting city: ");
        String fromCity = input.nextLine();
        System.out.print("Enter your via city: ");
        String viaCity = input.nextLine();
        System.out.print("Enter your final destination city: ");
        String toCity = input.nextLine();
        System.out.print("Enter distance from " + fromCity + " to " + viaCity + " in Miles: ");
        double fromToViaMiles = input.nextDouble();
        System.out.print("Enter distance from " + viaCity + " to " + toCity + " in Miles: ");
        double viaToFinalMiles = input.nextDouble();
        System.out.print("Enter time taken from " + fromCity + " to " + viaCity + " in minutes: ");
        double timeFromToViaMinutes = input.nextDouble();
        System.out.print("Enter time taken from " + viaCity + " to " + toCity + " in minutes: ");
        double timeViaToFinalMinutes = input.nextDouble();
        double totalDistanceMiles = fromToViaMiles + viaToFinalMiles;
        double totalDistanceKm = totalDistanceMiles * MILES_TO_KM_FACTOR;
        double totalTimeMinutes = timeFromToViaMinutes + timeViaToFinalMinutes;
        System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity +
                           " is " + String.format("%.2f", totalDistanceKm) + " km and the Total Time taken is " + String.format("%.2f", totalTimeMinutes) + " minutes");
        input.close();
    }
}