import java.util.Scanner;
public class Question22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the total number of chocolates: ");
        int numChocolates = input.nextInt();
        System.out.print("Enter the number of children: ");
        int numChildren = input.nextInt();
        if (numChildren <= 0) {
            System.out.println("Number of children must be greater than zero.");
        } else if (numChocolates < 0) {
            System.out.println("Number of chocolates cannot be negative.");
        }
        else {
            int chocolatesPerChild = numChocolates / numChildren;
            int remainingChocolates = numChocolates % numChildren;
            System.out.println("The number of chocolates each child gets is " + chocolatesPerChild + " and the number of remaining chocolates is " + remainingChocolates);
        }
        input.close();
    }
}
