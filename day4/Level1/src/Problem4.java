import java.util.*;

class Problem4 {
    public double rounds(int side1, int side2, int side3) {
        int distance = 5000;
        double perimeter = (side1 + side2 + side3) / 3;
        double numofrounds = (distance / perimeter);
        return numofrounds;
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the sides : ");
        int side1 = sn.nextInt();
        int side2 = sn.nextInt();
        int side3 = sn.nextInt();
        Problem4 p4 = new Problem4();
        double rounds = p4.rounds(side1, side2, side3);
        System.out.println("The Total num of rounds: " + rounds);
    }
}

