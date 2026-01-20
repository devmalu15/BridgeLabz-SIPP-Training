public class KMToMiles {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        double kilometers = scanner.nextDouble();
        double miles = kilometers * 0.621371;
        System.out.println(miles);
        scanner.close();
    }
}
