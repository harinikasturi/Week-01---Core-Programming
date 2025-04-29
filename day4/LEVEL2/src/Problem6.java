import java.util.*;
class UnitConverter3 {

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        System.out.println("100 Fahrenheit to Celsius: " + convertFahrenheitToCelsius(100));
        System.out.println("37 Celsius to Fahrenheit: " + convertCelsiusToFahrenheit(37));
        System.out.println("10 Pounds to Kilograms: " + convertPoundsToKilograms(10));
        System.out.println("50 Kilograms to Pounds: " + convertKilogramsToPounds(50));
        System.out.println("5 Gallons to Liters: " + convertGallonsToLiters(5));
        System.out.println("20 Liters to Gallons: " + convertLitersToGallons(20));
    }
}