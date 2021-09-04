import Facade_package.Booking_package.Badminton;
import Facade_package.Booking_package.Booking;
import Facade_package.Facade;
import Facade_package.Payment.DebitCard;
import Facade_package.Payment.PaymentAC;
import Facade_package.Player;

public class Client {
    public static void main (String args[]){
        Player player = new Player("Phat");
        Booking booking = new Badminton(player);
        PaymentAC payment = new DebitCard(player);

        Facade facade = new Facade(payment);

        facade.payBooking(booking);
        facade.cancelBooking(booking);
    }
}
