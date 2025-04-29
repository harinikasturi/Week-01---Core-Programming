import java.util.*;

class BonusCalculator {
    public static void main(String[] args) {
        int n = 10;
        double[] salary = new double[n];
        double[] yearsOfService = new double[n];
        double[] bonus = new double[n];
        double[] newSalary = new double[n];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            boolean validInput = false;
            while (!validInput) {
                try {
                    System.out.print("Enter salary for employee " + (i + 1) + ": ");
                    salary[i] = scanner.nextDouble();

                    System.out.print("Enter years of service for employee " + (i + 1) + ": ");
                    yearsOfService[i] = scanner.nextDouble();

                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.next(); // Clear invalid input
                    i--; // Decrement index counter
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("Bonus Details:");
        for (int i = 0; i < n; i++) {
            System.out.println("Employee " + (i + 1) + ": Bonus = " + bonus[i] + ", New Salary = " + newSalary[i]);
        }

        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}