import java.util.*;
class OTPGenerator {
    public static int generateOTP() {
        Random random = new Random();
        return random.nextInt(900000) + 100000; // 6-digit OTP
    }

    public static boolean areOTPsUnique(int[] otps) {
        HashSet<Integer> set = new HashSet<>();
        for (int otp : otps) {
            if (set.contains(otp)) return false;
            set.add(otp);
        }
        return true;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println("OTP " + (i + 1) + ": " + otps[i]);
        }

        System.out.println("Are all OTPs unique? " + areOTPsUnique(otps));
    }
}