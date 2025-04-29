import java.util.Scanner;

class Problem9{

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = sn.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = sn.nextInt();


            int[] result = findRemainderAndQuotient(number, divisor);
            System.out.println("Quotient: " + result[0]);
            System.out.println("Remainder: " + result[1]);


    }
}

