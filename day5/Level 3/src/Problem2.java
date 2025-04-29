import java.util.Scanner;

class Problem2 {
    public static char[] findUniqueChars(String text) {
        char[] allChars = new char[text.length()];
        int uniqueCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < uniqueCount; j++) {
                if (allChars[j] == current) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                allChars[uniqueCount++] = current;
            }
        }

        char[] result = new char[uniqueCount];
        System.arraycopy(allChars, 0, result, 0, uniqueCount);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char[] uniqueChars = findUniqueChars(text);
        System.out.println("Unique characters: " + String.valueOf(uniqueChars));
    }
}