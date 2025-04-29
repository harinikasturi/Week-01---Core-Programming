import java.util.Scanner;

class Problem10{

    public static int[] ChocolatesandStudents(int number, int Chocolates) {
        int perChild = Chocolates / number;
        int remaining = Chocolates % number;
        return new int[]{perChild, remaining};
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = sn.nextInt();

        System.out.print("Enter the Chocolates: ");
        int  Chocolates= sn.nextInt();


        int[] result = ChocolatesandStudents(number, Chocolates);
        System.out.println("perChild: " + result[0]);
        System.out.println("Remaining: " + result[1]);


    }
}

