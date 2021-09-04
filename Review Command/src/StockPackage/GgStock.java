package StockPackage;

public class GgStock extends StockInterface{
    public GgStock(int quantity) {
        super(quantity);
    }

    @Override
    public void buy() {
        System.out.println("Google stock: bought " + quantity + " stock(s)" );
    }

    @Override
    public void sell() {
        System.out.println("Google stock: sold " + quantity + " stock(s)" );
    }
}
