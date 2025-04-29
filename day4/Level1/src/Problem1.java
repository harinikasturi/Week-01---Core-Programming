import java.util.*;

class Problem1 {
    public double Simpleinterest(double p, double r, double t) {
        double si = p * r * t / 100;
        return si;
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the Values");
        double p = sn.nextDouble();
        double r = sn.nextDouble();
        double t = sn.nextDouble();

        Problem1 p1 = new Problem1();
        double si = p1.Simpleinterest(p, r, t);
        System.out.println("Sipmle Interest is: " + si);


    }
}