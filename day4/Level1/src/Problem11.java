import java.util.Scanner;

public class Problem11 {

    public double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        Problem11 p11 = new Problem11();

        System.out.println("Enter the temperature : ");
        double temperature = sn.nextDouble();

        System.out.println("Enter the wind speed : ");
        double windSpeed = sn.nextDouble();

            double windChill = p11.calculateWindChill(temperature, windSpeed);
            System.out.println("The wind chill temperature is: " + windChill);
        }

    }


