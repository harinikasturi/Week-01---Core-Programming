import java.util.Scanner;

class Problem8 {
    public static int[] generateAges(int count) {
        int[] ages = new int[count];
        for (int i = 0; i < count; i++) {
            ages[i] = (int)(Math.random() * 50) + 10; // Ages 10-60
        }
        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            result[i][1] = (ages[i] >= 18) ? "Can vote" : "Cannot vote";
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int count = sc.nextInt();

        int[] ages = generateAges(count);
        String[][] eligibility = checkVotingEligibility(ages);

        System.out.println("Age\t\tStatus");
        System.out.println("---------------------");
        for (String[] row : eligibility) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }
}