import java.util.Scanner;

public class Problem12 {

    public double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        Problem12 calculator = new Problem12();

        System.out.print("Enter the angle in degrees: ");
        double angle = sn.nextDouble();

        double[] results = calculator.calculateTrigonometricFunctions(angle);
        System.out.printf("Sine: " +results[0]);
        System.out.printf("Cosine:" +results[1]);
        System.out.printf("Tangent:" +results[2]);


    }
}


