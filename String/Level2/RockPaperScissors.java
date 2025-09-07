import java.util.Scanner;

public class RockPaperScissors {

    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);
        if (choice == 0) return "Rock";
        else if (choice == 1) return "Paper";
        else return "Scissors";
    }

    public static String findWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";
        if ((user.equals("Rock") && computer.equals("Scissors")) ||
            (user.equals("Paper") && computer.equals("Rock")) ||
            (user.equals("Scissors") && computer.equals("Paper"))) {
            return "User";
        } else {
            return "Computer";
        }
    }

    public static String[][] getStats(int userWins, int compWins, int draws, int total) {
        String[][] stats = new String[4][2];
        stats[0][0] = "User Wins";
        stats[0][1] = String.valueOf(userWins);
        stats[1][0] = "Computer Wins";
        stats[1][1] = String.valueOf(compWins);
        stats[2][0] = "Draws";
        stats[2][1] = String.valueOf(draws);
        stats[3][0] = "User Win %";
        stats[3][1] = String.valueOf((total == 0) ? 0 : Math.round((userWins * 100.0 / total)));
        return stats;
    }

    public static void displayStats(String[][] stats) {
        System.out.println("Statistic\tValue");
        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t\t" + stats[i
