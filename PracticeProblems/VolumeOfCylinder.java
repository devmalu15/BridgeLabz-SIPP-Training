import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("radius:");
        double radius = scanner.nextDouble();
        
        System.out.println("height:");
        double height = scanner.nextDouble();
        
        
        double volume = Math.PI * radius * radius * height;
        System.out.printf("volume- %.2f%n", volume);
        
        scanner.close();
    }
}
