import java.util.Scanner;

class Problem1 {
    public static String[][] calculateBMI(int[][] data) {
        String[][] result = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            double heightInMeters = data[i][1] / 100.0;
            double bmi = data[i][0] / (heightInMeters * heightInMeters);
            String status = getBMIStatus(bmi);
            result[i][0] = String.valueOf(data[i][1]);
            result[i][1] = String.valueOf(data[i][0]);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }
        return result;
    }

    private static String getBMIStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] data = new int[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i+1) + ": ");
            data[i][0] = sc.nextInt();
            System.out.print("Enter height (cm) for person " + (i+1) + ": ");
            data[i][1] = sc.nextInt();
        }

        String[][] bmiData = calculateBMI(data);

        System.out.println("\nBMI Results:");
        System.out.println("Height\tWeight\tBMI\tStatus");
        System.out.println("-------------------------------");
        for (String[] row : bmiData) {
            System.out.println(row[0] + "\t" + row[1] + "\t" + row[2] + "\t" + row[3]);
        }
    }
}