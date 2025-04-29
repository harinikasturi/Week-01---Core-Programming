import java.util.Scanner;

class Problem6 {
    public static String[][] getCharFrequency(String text) {
        char[] chars = text.toCharArray();
        int[] frequency = new int[text.length()];
        String[][] result = new String[text.length()][2];
        int resultIndex = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '\0') continue;

            frequency[i] = 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    frequency[i]++;
                    chars[j] = '\0';
                }
            }

            if (chars[i] != '\0') {
                result[resultIndex][0] = String.valueOf(chars[i]);
                result[resultIndex][1] = String.valueOf(frequency[i]);
                resultIndex++;
            }
        }

        String[][] finalResult = new String[resultIndex][2];
        System.arraycopy(result, 0, finalResult, 0, resultIndex);
        return finalResult;
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