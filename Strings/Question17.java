import java.util.*;
public class Question17{
        public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);
        if (choice == 0) return "rock";
        else if (choice == 1) return "paper";
        else return "scissors";
    }
    public static String decideWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";
        if ((user.equals("rock") && computer.equals("scissors")) ||
            (user.equals("paper") && computer.equals("rock")) ||
            (user.equals("scissors") && computer.equals("paper"))) {
            return "User";
        } else {
            return "Computer";
        }
    }
    public static String[][] generateStats(int userWins, int computerWins, int draws, int totalGames) {
        String[][] stats = new String[3][3];
        stats[0][0] = "Player";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f%%", (userWins * 100.0 / totalGames));
        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f%%", (computerWins * 100.0 / totalGames));
        stats[2][0] = "Draws";
        stats[2][1] = String.valueOf(draws);
        stats[2][2] = String.format("%.2f%%", (draws * 100.0 / totalGames));
        return stats;
    }
    public static void displayResults(String[][] rounds, String[][] stats) {
        System.out.println("\nGame Results:");
        System.out.println("Game\tUser\tComputer\tWinner");
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < rounds.length; i++) {
            System.out.println((i + 1) + "\t" + rounds[i][0] + "\t" + rounds[i][1] + "\t\t" + rounds[i][2]);
        }
        System.out.println("\nFinal Stats:");
        System.out.println("Player\tWins\tWin %");
        System.out.println("---------------------------");
        for (String[] row : stats) {
            System.out.println(row[0] + "\t" + row[1] + "\t" + row[2]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games to play: ");
        int totalGames = sc.nextInt();
        sc.nextLine();
        String[][] rounds = new String[totalGames][3];
        int userWins = 0, computerWins = 0, draws = 0;
        for (int i = 0; i < totalGames; i++) {
            System.out.print("Enter your choice (rock/paper/scissors): ");
            String userChoice = sc.nextLine().toLowerCase();
            String computerChoice = getComputerChoice();
            String winner = decideWinner(userChoice, computerChoice);
            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) computerWins++;
            else draws++;
            rounds[i][0] = userChoice;
            rounds[i][1] = computerChoice;
            rounds[i][2] = winner;
        }
        String[][] stats = generateStats(userWins, computerWins, draws, totalGames);
        displayResults(rounds, stats);
    }
}
