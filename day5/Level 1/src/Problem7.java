import java.util.Scanner;

class Problem7 {
    public static void generateException(String text) {
        System.out.println(Integer.parseInt(text));
    }

    public static void handleException(String text) {
        try {
            System.out.println(Integer.parseInt(text));
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught generic RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string (non-numeric): ");
        String text = sc.next();
        handleException(text);
    }
}