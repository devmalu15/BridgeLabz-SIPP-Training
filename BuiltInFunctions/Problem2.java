import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String input = scanner.nextLine();
        LocalDate date = LocalDate.parse(input);
        LocalDate addedDate = date.plusDays(7).plusMonths(1).plusYears(2);
        LocalDate finalDate = addedDate.minusWeeks(3);
        System.out.println("Original Date: " + date);
        System.out.println("After adding 7 days, 1 month, 2 years: " + addedDate);
        System.out.println("After subtracting 3 weeks: " + finalDate);
	}
}
