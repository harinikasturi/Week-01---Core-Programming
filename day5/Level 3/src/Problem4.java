import java.util.Scanner;

class Problem4 {
    public static String[][] getCharFrequency(String text) {
        int[] frequency = new int[256];
        int uniqueCount = 0;

        for (int i = 0; i < text.length(); i++) {
            if (frequency[text.charAt(i)] == 0) uniqueCount++;
            frequency[text.charAt(i)]++;
        }

        String[][] result = new String[uniqueCount][2];
        int index = 0;

        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char)i);
                result[index][1] = String.valueOf(frequency[i]);
                index++;
            }
        }

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