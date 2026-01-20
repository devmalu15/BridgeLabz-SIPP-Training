import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Problem4 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        LocalDate date1 = null;
	        LocalDate date2 = null;
	        while (date1 == null) {
	            System.out.print("Enter the first date (YYYY-MM-DD): ");
	            String dateString1 = scanner.nextLine();
	            try {
	                date1 = LocalDate.parse(dateString1);
	            } catch (DateTimeParseException e) {
	                System.out.println("Invalid date format. Please use YYYY-MM-DD.");
	            }
	        }
	        while (date2 == null) {
	            System.out.print("Enter the second date (YYYY-MM-DD): ");
	            String dateString2 = scanner.nextLine();
	            try {
	                date2 = LocalDate.parse(dateString2);
	            } catch (DateTimeParseException e) {
	                System.out.println("Invalid date format. Please use YYYY-MM-DD.");
	            }
	        }
	        if (date1.isBefore(date2)) {
	            System.out.println("The first date is before the second date.");
	        } else if (date1.isAfter(date2)) {
	            System.out.println("The first date is after the second date.");
	        } else if (date1.isEqual(date2)) {
	            System.out.println("The first date is the same as the second date.");
	        }
	 }
}
