package Facade_package.Booking_package;

import Facade_package.Player;

public abstract class Booking {
    private Player player;

    public Booking(Player player){
        this.player = player;
    }

    public abstract void book();
    public abstract void cancelBooking();
}
