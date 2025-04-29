import java.util.Scanner;

class  Problem10{
    public static String convertToLower(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c = (char)(c + 32);
            }
            result.append(c);
        }
        return result.toString();
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
        String text = sc.nextLine();

        String manualLower = convertToLower(text);
        String builtInLower = text.toLowerCase();

        System.out.println("Manual lowercase: " + manualLower);
        System.out.println("Built-in lowercase: " + builtInLower);
        System.out.println("Are equal: " + compareStrings(manualLower, builtInLower));
    }
}
