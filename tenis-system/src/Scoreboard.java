public class Scoreboard {
    private Player player1;
    private Player player2;
    int player1Score;
    int player2Score;

    public Scoreboard(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.player1Score = 0;
        this.player2Score = 0;
    }

    public void updateScore(Player player, int points) {
        if (player.getName().equals(player1.getName())) {
            player1Score += points;
            System.out.println("Fez ponto!");
        } else if (player.getName().equals(player2.getName())) {
            player2Score += points;
            System.out.println("Fez ponto!");
        }
    }

    public void decreaseScore(Player player, int points) {
        if (player.getName().equals(player1.getName())) {
            player1Score = Math.max(0, player1Score - points);
            System.out.println("Perdeu ponto!");
        } else if (player.getName().equals(player2.getName())) {
            player2Score = Math.max(0, player2Score - points);
            System.out.println("Perdeu ponto!");
        }
    }

    public void displayScore() {
        System.out.println("-------------------------");
        System.out.println("Placar:");
        System.out.println(player1.getName() + ": " + player1Score);
        System.out.println(player2.getName() + ": " + player2Score);
        System.out.println("-------------------------");
    }
}
