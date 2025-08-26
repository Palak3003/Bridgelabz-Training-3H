package String.Level2;
import java.util.Scanner;

public class RockPaperScissorsGame {

    public static String getComputerChoice() {
        int choice = (int)(Math.random() * 3); 
        if (choice == 0) return "rock";
        else if (choice == 1) return "paper";
        else return "scissors";
    }

    public static String findWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";

        if (user.equals("rock") && computer.equals("scissors") ||
            user.equals("scissors") && computer.equals("paper") ||
            user.equals("paper") && computer.equals("rock")) {
            return "User";
        } else {
            return "Computer";
        }
    }

    public static String[][] calculateStats(int userWins, int compWins, int totalGames) {
        String[][] stats = new String[2][3];

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.valueOf((userWins * 100) / totalGames) + "%";

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(compWins);
        stats[1][2] = String.valueOf((compWins * 100) / totalGames) + "%";

        return stats;
    }

    public static void displayResults(String[][] results, String[][] stats) {
        System.out.println("Game\tUser\tComputer\tWinner");
        System.out.println("----------------------------------------");
        for (int i = 0; i < results.length; i++) {
            System.out.println((i + 1) + "\t" + results[i][0] + "\t" + results[i][1] + "\t\t" + results[i][2]);
        }

        System.out.println("\nSummary Stats:");
        System.out.println("Player\tWins\tWinning %");
        System.out.println("-----------------------------");
        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[][] results = new String[n][3];
        int userWins = 0, compWins = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter your choice (rock/paper/scissors): ");
            String userChoice = sc.nextLine().toLowerCase();

            String compChoice = getComputerChoice();
            String winner = findWinner(userChoice, compChoice);

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;

            results[i][0] = userChoice;
            results[i][1] = compChoice;
            results[i][2] = winner;
        }

        String[][] stats = calculateStats(userWins, compWins, n);
        displayResults(results, stats);
    }
}

