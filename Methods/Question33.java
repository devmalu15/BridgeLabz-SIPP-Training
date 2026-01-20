package Methods;
import java.util.Scanner;

public class Question33 {

    public static String getMonthName(int month) {
        String[] months = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1];
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getNumberOfDaysInMonth(int month, int year) {
        int[] days = {
                31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31
        };
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return days[month - 1];
    }

    public static int getStartDay(int month, int year) {
        int y = year;
        int m = month;

        if (m < 3) {
            m += 12;
            y -= 1;
        }

        int q = 1;
        int k = y % 100;
        int j = y / 100;

        int h = (q + (13 * (m + 1)) / 5 + k + (k / 4) + (j / 4) + (5 * j)) % 7;

        int dayOfWeek = (h + 6) % 7;
        return dayOfWeek;
    }

    public static void printCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int daysInMonth = getNumberOfDaysInMonth(month, year);
        int startDay = getStartDay(month, year);

        System.out.println("      " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }

        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);
            if ((startDay + day) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year (e.g., 2005): ");
        int year = scanner.nextInt();

        if (month < 1 || month > 12 || year < 1) {
            System.out.println("Invalid input. Please enter valid month and year.");
        } else {
            printCalendar(month, year);
        }

        scanner.close();
    }
}
