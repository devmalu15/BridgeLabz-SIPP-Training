package ControlFlow;

import java.util.Scanner;
public class Question21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Amar's age: ");
        int amarAge = input.nextInt();
        System.out.print("Enter Amar's height (cm): ");
        double amarHeight = input.nextDouble();

        System.out.print("Enter Akbar's age: ");
        int akbarAge = input.nextInt();
        System.out.print("Enter Akbar's height (cm): ");
        double akbarHeight = input.nextDouble();

        System.out.print("Enter Anthony's age: ");
        int anthonyAge = input.nextInt();
        System.out.print("Enter Anthony's height (cm): ");
        double anthonyHeight = input.nextDouble();

        int youngestAge = amarAge;
        String youngestFriend = "Amar";
        if (akbarAge < youngestAge) {
            youngestAge = akbarAge;
            youngestFriend = "Akbar";
        }
        if (anthonyAge < youngestAge) {
            youngestAge = anthonyAge;
            youngestFriend = "Anthony";
        }
        System.out.println("The youngest friend is " + youngestFriend + " with age " + youngestAge);

        double tallestHeight = amarHeight;
        String tallestFriend = "Amar";
        if (akbarHeight > tallestHeight) {
            tallestHeight = akbarHeight;
            tallestFriend = "Akbar";
        }
        if (anthonyHeight > tallestHeight) {
            tallestHeight = anthonyHeight;
            tallestFriend = "Anthony";
        }
        System.out.println("The tallest friend is " + tallestFriend + " with height " + tallestHeight + " cm");
        input.close();
    }
}