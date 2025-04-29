import java.util.Scanner;
class Problem9 {
    public static String getComputerChoice() {
        int choice = (int)(Math.random() * 3);
        return switch (choice) {
            case 0 -> "rock";
            case 1 -> "paper";
            case 2 -> "scissors";
            default -> "";
        };
    }

    public static String determineWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";
        if ((user.equals("rock") && computer.equals("scissors")) ||
                (user.equals("paper") && computer.equals("rock")) ||
                (user.equals("scissors") && computer.equals("paper"))) {
            return "User";
        }
        return "Computer";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int games = sc.nextInt();
        sc.nextLine();

        int userWins = 0, computerWins = 0, draws = 0;

        for (int i = 0; i < games; i++) {
            System.out.print("Enter your choice (rock/paper/scissors): ");
            String userChoice = sc.nextLine().toLowerCase();
            String computerChoice = getComputerChoice();

            String result = determineWinner(userChoice, computerChoice);
            if (result.equals("User")) userWins++;
            else if (result.equals("Computer")) computerWins++;
            else draws++;

            System.out.println("Computer chose: " + computerChoice);
            System.out.println("Result: " + result);
        }

        System.out.println("\nFinal Stats:");
        System.out.println("User wins: " + userWins);
        System.out.println("Computer wins: " + computerWins);
        System.out.println("Draws: " + draws);
        System.out.println("User win %: " + (userWins * 100 / games) + "%");
        System.out.println("Computer win %: " + (computerWins * 100 / games) + "%");
    }
}
