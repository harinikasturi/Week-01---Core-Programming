import java.util.Scanner;

class Problem7 {
    public static boolean isPalindrome1(String text) {
        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindrome2(String text, int left, int right) {
        if (left >= right) return true;
        if (text.charAt(left) != text.charAt(right)) return false;
        return isPalindrome2(text, left + 1, right - 1);
    }

    public static boolean isPalindrome3(String text) {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equals(reversed);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        System.out.println("Method 1 (Iterative): " + isPalindrome1(text));
        System.out.println("Method 2 (Recursive): " + isPalindrome2(text, 0, text.length()-1));
        System.out.println("Method 3 (Reverse): " + isPalindrome3(text));
    }
}