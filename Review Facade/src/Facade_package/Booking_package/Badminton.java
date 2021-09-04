package Facade_package.Booking_package;

import Facade_package.Player;

public class Badminton extends Booking{
    public Badminton(Player player) {
        super(player);
    }

    @Override
    public void book() {
        System.out.println("This booking is placed");
    }

    @Override
    public void cancelBooking() {
        System.out.println("This booking is canceled");
    }
}
