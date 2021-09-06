package Tournament;

public class Player implements Tournament {
    String name;
    int strength;

    public Player(String name, int strength){
        this.name = name;
        this.strength = strength;
    }

    public int getStrength(){
        return strength;
    }

    @Override
    public Tournament getWinner() {
        return this;
    }

    @Override
    public String toString() {
        return "Player name: " + name + " with strength: " + strength;
    }
}
