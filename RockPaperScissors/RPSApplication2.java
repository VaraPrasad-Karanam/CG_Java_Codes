package RockPaperScissors;

import java.util.*;

public class RPSApplication2 {

    static int cs;
    static int us;
    static int tie;

    public static void gameStart(Scanner sc) {

        Random rd = new Random();
        String arr[] = {"r", "s", "p"};

        // User input
        System.out.println("Choose:");
        System.out.println("0 - Rock");
        System.out.println("1 - Scissors");
        System.out.println("2 - Paper");

        int usi = sc.nextInt();

        if (usi < 0 || usi > 2) {
            System.out.println("Invalid user input");
            return;
        }

        String usc = arr[usi];
        System.out.println("User Choice: " + usc);

        // Computer input
        int cmi = rd.nextInt(3);
        String cmc = arr[cmi];
        System.out.println("Computer Choice: " + cmc);

        // Game logic
        if (usc.equals(cmc)) {
            System.out.println("Match Tie");
            tie++;
        }
        else if ((usc.equals("s") && cmc.equals("p"))
                || (usc.equals("r") && cmc.equals("s"))
                || (usc.equals("p") && cmc.equals("r"))) {

            System.out.println("User Wins");
            us++;
        }
        else {
            System.out.println("Computer Wins");
            cs++;
        }
    }

    public static void score() {
        System.out.println("\n===== SCORE BOARD =====");
        System.out.println("Computer Score : " + cs);
        System.out.println("User Score     : " + us);
        System.out.println("Tie Matches    : " + tie);
        System.out.println("=======================\n");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean start = true;

        while (start) {

            System.out.println("\n1. Start Game");
            System.out.println("2. Check Score");
            System.out.println("3. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    gameStart(sc);
                    break;

                case 2:
                    score();
                    break;

                case 3:
                    System.out.println("Come again and play!");
                    start = false;
                    break;

                default:
                    System.out.println("Invalid Choice. Please enter 1, 2, or 3.");
            }
        }

        sc.close();
    }
}