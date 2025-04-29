import java.util.*;

class StudentMarks {
    public static int[][] generateScores(int students) {
        int[][] scores = new int[students][3];
        Random random = new Random();
        for (int i = 0; i < students; i++) {
            scores[i][0] = random.nextInt(101); // Physics (0-100)
            scores[i][1] = random.nextInt(101); // Chemistry (0-100)
            scores[i][2] = random.nextInt(101); // Maths (0-100)
        }
        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            results[i][0] = total;
            results[i][1] = Math.round(average * 100) / 100.0; // Round to 2 decimal places
            results[i][2] = Math.round(percentage * 100) / 100.0; // Round to 2 decimal places
        }
        return results;
    }

    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.2f\t%.2f\t%.2f\n",
                    i + 1, scores[i][0], scores[i][1], scores[i][2],
                    results[i][0], results[i][1], results[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = scanner.nextInt();

        int[][] scores = generateScores(students);
        double[][] results = calculateResults(scores);
        displayScorecard(scores, results);
    }
}