import java.util.*;

class FootballTeam {

    public static int[] generateHeights() {
        int[] heights = new int[11];
        Random random = new Random();
        for (int i = 0; i < 11; i++) {
            heights[i] = random.nextInt(101) + 150;
        }
        return heights;
    }


    public static int sumHeights(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }


    public static double meanHeight(int[] heights) {
        return (double) sumHeights(heights) / heights.length;
    }


    public static int shortestHeight(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    public static int tallestHeight(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights();
        System.out.println("Player Heights: ");
        for (int height : heights) {
            System.out.print(height + " ");
        }

        System.out.println("\nMean Height: " + meanHeight(heights));
        System.out.println("Shortest Height: " + shortestHeight(heights));
        System.out.println("Tallest Height: " + tallestHeight(heights));
    }
}