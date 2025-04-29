import java.util.Scanner;

class Problem7 {
    public static String trimSpaces(String text) {
        int start = 0, end = text.length() - 1;
        while (start <= end && text.charAt(start) == ' ') start++;
        while (end >= start && text.charAt(end) == ' ') end--;
        return text.substring(start, end + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with spaces: ");
        String text = sc.nextLine();

        String manualTrim = trimSpaces(text);
        String builtInTrim = text.trim();

        System.out.println("Manual trim: '" + manualTrim + "'");
        System.out.println("Built-in trim: '" + builtInTrim + "'");
        System.out.println("Results match: " + manualTrim.equals(builtInTrim));
    }
}