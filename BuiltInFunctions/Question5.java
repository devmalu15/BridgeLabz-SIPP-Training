import java.util.*;
public class Question5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		play(sc);
	}
	public static void play(Scanner sc) {
		int low=1;
		int high=100;
		String feedback;
		do {
			int guess=generateGuess(low,high);
			System.out.println("My guess is : "+guess);
			feedback = getFeedback(sc);

            if (feedback.equalsIgnoreCase("high")) {
                high = guess - 1;
            } else if (feedback.equalsIgnoreCase("low")) {
                low = guess + 1;
            } else if (!feedback.equalsIgnoreCase("correct")) {
                System.out.println("Please respond with 'high', 'low', or 'correct'.");
            }
        } while (!feedback.equalsIgnoreCase("correct"));
        System.out.println("Yay! I've guessed your number correctly.");
		}
	public static int generateGuess(int low, int high) {
        Random random = new Random();
        return low + random.nextInt(high - low + 1);
    }
	 public static String getFeedback(Scanner sc) {
	        System.out.print("Enter feedback ('high' if guess is too high, 'low' if too low, 'correct' if right): ");
	        return sc.nextLine().trim();
	    }
}
