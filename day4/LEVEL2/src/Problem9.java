import java.util.*;

class NumberChecker {

    public static boolean isPositive(int number) {
        return number >= 0;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int compare(int num1, int num2) {
        if (num1 > num2) return 1;
        else if (num1 < num2) return -1;
        else return 0;
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sn.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            if (isPositive(numbers[i])) {
                System.out.println(numbers[i] + " is positive and " + (isEven(numbers[i]) ? "even." : "odd."));
            } else {
                System.out.println(numbers[i] + " is negative.");
            }
        }

        int comparison = compare(numbers[0], numbers[4]);
        if (comparison == 1) {
            System.out.println("First number is greater than the last.");
        } else if (comparison == -1) {
            System.out.println("First number is less than the last.");
        } else {
            System.out.println("First and last numbers are equal.");
        }
    }
}