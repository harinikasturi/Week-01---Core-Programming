import java.util.Scanner;

class Problem3 {
    public static String[][] getWordsWithLengths(String text) {
        String[] words = text.split(" ");
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(words[i].length());
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[][] wordData = getWordsWithLengths(text);

        System.out.println("Word\t\tLength");
        System.out.println("---------------------");
        for (String[] row : wordData) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }
}