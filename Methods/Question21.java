package Methods;
public class Question21 {

    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }

    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }

    public static double convertInchesToCentimeters(double inches) {
        return inches * 2.54;
    }

    public static void main(String[] args) {
        System.out.println("Yards to Feet: " + convertYardsToFeet(5));
        System.out.println("Feet to Yards: " + convertFeetToYards(15));
        System.out.println("Meters to Inches: " + convertMetersToInches(2));
        System.out.println("Inches to Meters: " + convertInchesToMeters(78));
        System.out.println("Inches to Centimeters: " + convertInchesToCentimeters(10));
    }
}
