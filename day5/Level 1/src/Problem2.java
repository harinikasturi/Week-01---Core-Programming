import java.util.Scanner;
class Problem2{
    public static String createSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result+=(text.charAt(i));
        }

        return result;
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String manualSubstring = createSubstring(text, start, end);
        String builtInSubstring = text.substring(start, end);

        System.out.println("Manual substring: " + manualSubstring);
        System.out.println("Built-in substring: " + builtInSubstring);
        System.out.println("Are equal: " + compareStrings(manualSubstring, builtInSubstring));
    }
}
