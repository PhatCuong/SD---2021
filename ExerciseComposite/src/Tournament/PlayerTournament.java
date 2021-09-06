package Tournament;

import java.util.ArrayList;
import java.util.List;

public class PlayerTournament implements Tournament{

    private List<Tournament> players = new ArrayList<>();
    private Player winner;

    public void add(Tournament player){
        players.add(player);
    }

    public void add(List<Tournament> tournaments){
        players.addAll(tournaments);
    }

    @Override
    public Tournament getWinner() {
        winner = (Player) players.get(0).getWinner();
        for (int i = 1; i < players.size(); i++) {
            Player player = (Player) players.get(i).getWinner();
            if (winner.getStrength() < player.getStrength())
                winner = player;
        }
        return winner;
    }
}
