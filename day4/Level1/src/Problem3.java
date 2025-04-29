import java.util.*;

class Problem3 {
    public int handshakes(int n) {
        int combinations = (n * (n - 1) / 2);
        return combinations;
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the number of students : ");
        int n = sn.nextInt();
        Problem2 p2 = new Problem2();
        int combinations = p2.handshakes(n);
        System.out.println("the number of handshakes is: " + combinations);
    }
}