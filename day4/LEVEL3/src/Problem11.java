import java.util.Random;

class EmployeeBonus {

    public static int[][] generateEmployeeData(int size) {
        int[][] data = new int[size][2];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            data[i][0] = random.nextInt(90000) + 10000; // 5-digit salary
            data[i][1] = random.nextInt(15) + 1; // Years of service (1-15)
        }
        return data;
    }

    public static double[][] calculateBonus(int[][] data) {
        double[][] result = new double[data.length][3];
        for (int i = 0; i < data.length; i++) {
            int salary = data[i][0];
            int years = data[i][1];
            double bonus = (years > 5) ? salary * 0.05 : salary * 0.02;
            double newSalary = salary + bonus;
            result[i][0] = salary;
            result[i][1] = newSalary;
            result[i][2] = bonus;
        }
        return result;
    }

    public static void displayResults(double[][] result) {
        System.out.println("Old Salary\tNew Salary\tBonus");
        for (double[] row : result) {
            System.out.printf("%.2f\t\t%.2f\t\t%.2f\n", row[0], row[1], row[2]);
        }
    }

    public static void main(String[] args) {
        int[][] employeeData = generateEmployeeData(10);
        double[][] bonusData = calculateBonus(employeeData);
        displayResults(bonusData);
    }
}