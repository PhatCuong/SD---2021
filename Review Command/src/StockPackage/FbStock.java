package StockPackage;

public class FbStock extends StockInterface{
    public FbStock(int quantity) {
        super(quantity);
    }

    @Override
    public void buy() {
        System.out.println("Facebook stock: bought " + quantity + " stock(s)" );
    }

    @Override
    public void sell() {
        System.out.println("Facebook stock: sold " + quantity + " stock(s)" );
    }
}
