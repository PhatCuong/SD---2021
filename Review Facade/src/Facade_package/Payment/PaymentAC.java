package Facade_package.Payment;

import Facade_package.Booking_package.Booking;
import Facade_package.Player;

public abstract class PaymentAC {
    private final Player player;

    public PaymentAC(Player player) {
        this.player = player;
    }

    public void pay(Booking booking){
        System.out.println("Paid for: " + booking.getClass().getSimpleName());
    }

    public void refund(Booking booking){
        System.out.println("Refunded for: " + booking.getClass().getSimpleName());
    }
}