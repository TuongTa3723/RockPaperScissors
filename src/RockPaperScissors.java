import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String playerA, playerB, again;

        do {
            do {
                System.out.print("Player A, enter your move (R, P, or S): ");
                playerA = in.nextLine().trim();
            } while (!playerA.equalsIgnoreCase("R") &&
                    !playerA.equalsIgnoreCase("P") &&
                    !playerA.equalsIgnoreCase("S"));

            do {
                System.out.print("Player B, enter your move (R, P, or S): ");
                playerB = in.nextLine().trim();
            } while (!playerB.equalsIgnoreCase("R") &&
                    !playerB.equalsIgnoreCase("P") &&
                    !playerB.equalsIgnoreCase("S"));

            if (playerA.equalsIgnoreCase(playerB)) {
                System.out.println("It's a Tie! Both chose " + moveName(playerA));
            } else if ((playerA.equalsIgnoreCase("R") && playerB.equalsIgnoreCase("S")) ||
                    (playerA.equalsIgnoreCase("P") && playerB.equalsIgnoreCase("R")) ||
                    (playerA.equalsIgnoreCase("S") && playerB.equalsIgnoreCase("P"))) {
                System.out.println(resultPhrase(playerA, playerB) + " Player A wins!");
            } else {
                System.out.println(resultPhrase(playerB, playerA) + " Player B wins!");
            }

            System.out.print("Do you want to play again? [Y/N]: ");
            again = in.nextLine().trim();
        } while (again.equalsIgnoreCase("Y"));

        System.out.println("Thanks for playing!");
    }

    private static String moveName(String move) {
        if (move.equalsIgnoreCase("R")) return "Rock";
        if (move.equalsIgnoreCase("P")) return "Paper";
        return "Scissors";
    }

    private static String resultPhrase(String winner, String loser) {
        if (winner.equalsIgnoreCase("R") && loser.equalsIgnoreCase("S"))
            return "Rock breaks Scissors.";
        else if (winner.equalsIgnoreCase("P") && loser.equalsIgnoreCase("R"))
            return "Paper covers Rock.";
        else if (winner.equalsIgnoreCase("S") && loser.equalsIgnoreCase("P"))
            return "Scissors cuts Paper.";
        else
            return "";
    }
}