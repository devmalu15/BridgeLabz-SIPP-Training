import java.util.Scanner;
public class Question15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();
        double sideLength = perimeter / 4.0;
        System.out.println("The length of the side is " + sideLength + " whose perimeter is " + perimeter);
        input.close();
    }
}