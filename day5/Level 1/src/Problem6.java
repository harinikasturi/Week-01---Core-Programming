import java.util.Scanner;

class Problem6 {
    public static void generateException(String text) {
        System.out.println(text.substring(5, 2));
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.substring(5, 2));

       }catch (RuntimeException e) {
            System.out.println("Caught generic RuntimeException: " + e);
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        handleException(text);
    }
}