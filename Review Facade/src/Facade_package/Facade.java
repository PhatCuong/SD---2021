package Facade_package;

import Facade_package.Booking_package.Booking;
import Facade_package.Payment.PaymentAC;

public class Facade {
    private Booking booking;
    private final PaymentAC paymentAC;

    public Facade(PaymentAC paymentAC) {
        this.paymentAC = paymentAC;
    }

    public void payBooking(Booking booking){
        this.booking = booking;
        paymentAC.pay(booking);
        booking.book();
    }

    public void cancelBooking(Booking booking){
        this.booking = booking;
        booking.cancelBooking();
        paymentAC.refund(booking);
        this.booking = null;
    }

}
