import java.util.Scanner;
public class Question26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your salary (INR): ");
        double salary = input.nextDouble();
        System.out.print("Enter your bonus (INR): ");
        double bonus = input.nextDouble();
        double totalIncome = salary + bonus;
        System.out.println("The salary is INR " + salary + " and the bonus is INR " + bonus + ". Hence Total Income is INR " + totalIncome);
        input.close();
    }
}