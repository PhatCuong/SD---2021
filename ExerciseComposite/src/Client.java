import Tournament.*;


public class Client {
    public static void main(String args[]){
        Player player1 = new Player("A", 10);
        Player player2 = new Player("B", 40);
        Player player3 = new Player("C", 30);
        Player player4 = new Player("D", 20);

        PlayerTournament match1 = new PlayerTournament();
        match1.add(player1);
        match1.add(player2);
        System.out.println("Winner match 1: " + match1.getWinner().toString());

        System.out.println("-------------------------");
        PlayerTournament match2 = new PlayerTournament();
        match2.add(player3);
        match2.add(player4);
        System.out.println("Winner match 2: " + match2.getWinner().toString());

        System.out.println("-------------------------");
        PlayerTournament finalmatch = new PlayerTournament();
        finalmatch.add(match1);
        finalmatch.add(match2);
        System.out.println("Champion: " + finalmatch.getWinner().toString());
        finalmatch.getWinner();
    }
}
