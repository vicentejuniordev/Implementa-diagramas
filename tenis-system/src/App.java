public class App {
    public static void main(String[] args) throws Exception {
        Player player1 = new Player("Alice", "123 Main St", "555-1234", java.sql.Date.valueOf("1990-01-01"), 5);
        Player player2 = new Player("Bob", "456 Elm St", "555-5678", java.sql.Date.valueOf("1988-05-15"), 6);

        player1.infoPlayer();
        player2.infoPlayer();

        Match match = new Match(java.sql.Date.valueOf("2024-07-01"), java.sql.Time.valueOf("15:00:00"), 1, player1,
                player2);


        match.startMatch();
        match.scoreboard.updateScore(player1, 10);
        match.scoreboard.updateScore(player2, 8);
        match.endMatch();

        player1.infoPlayer();
        player2.infoPlayer();
    }
}
