import java.util.*;

class QuadraticEquation {
    public static double[] findRoots(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            return new double[0];
        } else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        }
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = sn.nextDouble();
        System.out.print("Enter b: ");
        double b = sn.nextDouble();
        System.out.print("Enter c: ");
        double c = sn.nextDouble();

        double[] roots = findRoots(a, b, c);
        if (roots.length == 0) {
            System.out.println("No real roots.");
        } else if (roots.length == 1) {
            System.out.println("One real root: " + roots[0]);
        } else {
            System.out.println("Two real roots: " + roots[0] + " and " + roots[1]);
        }
    }
}