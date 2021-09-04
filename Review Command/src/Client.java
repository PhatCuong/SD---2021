import CommandPackage.BuyStock;
import CommandPackage.OrderInterface;
import CommandPackage.SellStock;
import StockPackage.FbStock;
import StockPackage.GgStock;
import StockPackage.StockInterface;

public class Client {
    public static void main(String args[]){
        Broker broker = new Broker();
        StockInterface facebook = new FbStock(10);
        StockInterface google = new GgStock(20);

        BuyStock buyFacebook = new BuyStock(facebook);
        BuyStock buyGoogle = new BuyStock(google);
        SellStock sellStock = new SellStock(google);

        broker.takeOrder(buyFacebook);
        broker.takeOrder(buyGoogle);
        broker.takeOrder(sellStock);

        broker.placeOrder();
    }
}
