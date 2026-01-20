package ControlFlow;

public class Question37 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java Question37 <month> <day> <year>");
            return;
        }
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;

        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println("The day of the week for " + m + "/" + d + "/" + y + " is " + daysOfWeek[d0] + " (" + d0 + ")");
    }
}