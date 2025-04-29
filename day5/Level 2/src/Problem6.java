import java.util.Scanner;

class Problem6 {
    public static String[][] classifyCharacters(String text) {
        String[][] result = new String[text.length()][2];
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            result[i][0] = String.valueOf(c);
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    result[i][1] = "Vowel";
                } else {
                    result[i][1] = "Consonant";
                }
            } else {
                result[i][1] = "Not a Letter";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] classification = classifyCharacters(text);
        System.out.println("Character\tType");
        System.out.println("---------------------");
        for (String[] row : classification) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }
}