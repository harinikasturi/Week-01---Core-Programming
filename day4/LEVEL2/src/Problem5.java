import java.util.*;
class UnitConverter2 {

    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }
    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }

    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }

    public static double convertInchesToCm(double inches) {
        return inches * 2.54;
    }

    public static void main(String[] args) {
        System.out.println("3 yards to feet: " + convertYardsToFeet(3));
        System.out.println("9 feet to yards: " + convertFeetToYards(9));
        System.out.println("2 meters to inches: " + convertMetersToInches(2));
        System.out.println("12 inches to meters: " + convertInchesToMeters(12));
        System.out.println("5 inches to cm: " + convertInchesToCm(5));
    }
}