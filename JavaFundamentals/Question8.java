import java.lang.Math;

public class Question8 {
    public static void main(String[] args) {
        final double PI = Math.PI;
        final double EARTH_RADIUS_KM = 6378.0;

        double volumeKm3 = (4.0 / 3.0) * PI * Math.pow(EARTH_RADIUS_KM, 3);

        final double KM_TO_MILES_FACTOR = 0.621371;
        double earthRadiusMiles = EARTH_RADIUS_KM * KM_TO_MILES_FACTOR;

        double volumeMiles3 = (4.0 / 3.0) * PI * Math.pow(earthRadiusMiles, 3);

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMiles3);
    }
}