import java.sql.Date;
import java.sql.Time;

public class Match {
    private Date matchDate;
    private Time matchTime;
    private int blockNumber;
    private Player player1;
    private Player player2;
    Scoreboard scoreboard;

    public Match(Date matchDate, Time matchTime, int blockNumber, Player player1, Player player2) {
        this.matchDate = matchDate;
        this.matchTime = matchTime;
        this.blockNumber = blockNumber;
        this.player1 = player1;
        this.player2 = player2;
    }

    public void infoMatch() {
        System.out.println("Data da Partida: " + matchDate);
        System.out.println("Hora da Partida: " + matchTime);
        System.out.println("Número do Bloco: " + blockNumber);
        System.out.println("Jogador 1:");
        player1.infoPlayer();
        System.out.println("Jogador 2:");
        player2.infoPlayer();
    }

    public void setScoreboard(Scoreboard scoreboard) {
        this.scoreboard = scoreboard;
    }

    public void startMatch() {
        System.out.println("A partida entre " + player1.getName() + " e " + player2.getName() + " começou!");

        setScoreboard(new Scoreboard(player1, player2));
    }

    public void endMatch() {
        scoreboard.displayScore();
        System.out.println("A partida terminou!");
        System.out.println("Vencedor: " + (scoreboard.player1Score > scoreboard.player2Score ? player1.getName() : player2.getName()));

        player1.numberOfVictories += (scoreboard.player1Score > scoreboard.player2Score) ? 1 : 0;
        player1.numberOfDefeats += (scoreboard.player1Score < scoreboard.player2Score) ? 1 : 0;
        player2.numberOfVictories += (scoreboard.player2Score > scoreboard.player1Score) ? 1 : 0;
        player2.numberOfDefeats += (scoreboard.player2Score < scoreboard.player1Score) ? 1 : 0;
    }

    
}