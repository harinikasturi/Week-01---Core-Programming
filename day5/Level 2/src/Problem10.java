import java.util.Scanner;

class Problem10{
    public static int[][] generateScores(int students) {
        int[][] scores = new int[students][3];
        for (int i = 0; i < students; i++) {
            scores[i][0] = (int)(Math.random() * 51) + 50;
            scores[i][1] = (int)(Math.random() * 51) + 50;
            scores[i][2] = (int)(Math.random() * 51) + 50;
        }
        return scores;
    }

    public static String calculateGrade(int percentage) {
        if (percentage >= 90) return "A+";
        if (percentage >= 80) return "A";
        if (percentage >= 70) return "B+";
        if (percentage >= 60) return "B";
        if (percentage >= 50) return "C";
        return "F";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        int[][] scores = generateScores(students);

        System.out.println("\nStudent Scorecard");
        System.out.println("Physics\tChem\tMath\tTotal\tAvg\t%\tGrade");
        System.out.println("--------------------------------------------------");

        for (int[] student : scores) {
            int total = student[0] + student[1] + student[2];
            double average = total / 3.0;
            int percentage = (int)Math.round(average);
            String grade = calculateGrade(percentage);

            System.out.printf("%d\t%d\t%d\t%d\t%.1f\t%d%%\t%s%n",
                    student[0], student[1], student[2], total, average, percentage, grade);
        }
    }
}