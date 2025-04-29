import java.util.Scanner;

class Problem5 {
    public static String[][] getCharFrequency(String text) {
        char[] uniqueChars = findUniqueChars(text);
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            int count = 0;
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == uniqueChars[i]) count++;
            }
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(count);
        }

        return result;
    }

    private static char[] findUniqueChars(String text) {
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

        String[][] frequency = getCharFrequency(text);

        System.out.println("Character\tFrequency");
        System.out.println("---------------------");
        for (String[] row : frequency) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }
}