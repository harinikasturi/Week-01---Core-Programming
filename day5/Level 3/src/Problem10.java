import java.util.Scanner;

class Problem10{
    private static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] RANKS = {
            "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Jack", "Queen", "King", "Ace"
    };

    public static String[] initializeDeck() {
        String[] deck = new String[SUITS.length * RANKS.length];
        int index = 0;
        for (String suit : SUITS) {
            for (String rank : RANKS) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    public static void shuffleDeck(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int randomIndex = i + (int)(Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
    }

    public static String[][] distributeCards(String[] deck, int players, int cardsPerPlayer) {
        if (players * cardsPerPlayer > deck.length) {
            throw new IllegalArgumentException("Not enough cards in the deck");
        }

        String[][] distribution = new String[players][cardsPerPlayer];
        int cardIndex = 0;

        for (int player = 0; player < players; player++) {
            for (int card = 0; card < cardsPerPlayer; card++) {
                distribution[player][card] = deck[cardIndex++];
            }
        }

        return distribution;
    }

    public static void printDistribution(String[][] distribution) {
        System.out.println("\nCard Distribution:");
        for (int i = 0; i < distribution.length; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (int j = 0; j < distribution[i].length; j++) {
                System.out.println("  " + distribution[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of players: ");
        int players = sc.nextInt();
        System.out.print("Enter cards per player: ");
        int cardsPerPlayer = sc.nextInt();

        try {
            String[] deck = initializeDeck();
            shuffleDeck(deck);
            String[][] distribution = distributeCards(deck, players, cardsPerPlayer);
            printDistribution(distribution);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}