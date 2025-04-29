import java.util.*;

class Friends {
    public static String findYoungest(int[] ages, String[] names) {
        int minAge = ages[0];
        String youngest = names[0];
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngest = names[i];
            }
        }
        return youngest;
    }

    public static String findTallest(double[] heights, String[] names) {
        double maxHeight = heights[0];
        String tallest = names[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallest = names[i];
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];


        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sn.nextInt();
            System.out.print("Enter height of " + names[i] + " (in cm): ");
            heights[i] = sn.nextDouble();
        }

        System.out.println("Youngest friend: " + findYoungest(ages, names));
        System.out.println("Tallest friend: " + findTallest(heights, names));
    }
}