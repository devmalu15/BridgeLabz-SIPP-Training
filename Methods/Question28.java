package Methods;
import java.util.HashSet;
import java.util.Set;

public class Question28 {

    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000;
    }

    public static boolean areOTPsUnique(int[] otps) {
        Set<Integer> uniqueSet = new HashSet<>();
        for (int otp : otps) {
            uniqueSet.add(otp);
        }
        return uniqueSet.size() == otps.length;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
        }

        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }

        boolean unique = areOTPsUnique(otps);
        System.out.println("All OTPs are unique: " + unique);
    }
}
