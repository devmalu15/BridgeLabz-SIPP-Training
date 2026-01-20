package Methods;
import java.util.Arrays;

public class Question29 {

    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    public static int[] extractDigits(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        return digits;
    }

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }

    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, 2);
        }
        return sum;
    }

    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[] freq = new int[10];
        for (int d : digits) {
            freq[d]++;
        }

        int count = 0;
        for (int f : freq) {
            if (f > 0)
                count++;
        }

        int[][] result = new int[count][2];
        int index = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                result[index][0] = i;
                result[index][1] = freq[i];
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 122334;

        System.out.println("Number: " + number);
        int count = countDigits(number);
        System.out.println("Count of Digits: " + count);

        int[] digits = extractDigits(number);
        System.out.println("Digits: " + Arrays.toString(digits));

        int sum = sumOfDigits(digits);
        System.out.println("Sum of Digits: " + sum);

        int sumSquares = sumOfSquaresOfDigits(digits);
        System.out.println("Sum of Squares of Digits: " + sumSquares);

        boolean isHarshad = isHarshadNumber(number, digits);
        System.out.println("Is Harshad Number: " + isHarshad);

        int[][] frequency = digitFrequency(digits);
        System.out.println("Digit Frequency:");
        for (int[] row : frequency) {
            System.out.println("Digit " + row[0] + " => " + row[1] + " time(s)");
        }
    }
}
