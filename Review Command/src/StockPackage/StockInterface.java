package StockPackage;

public abstract class StockInterface {
    public int quantity;

    public StockInterface(int quantity){
        this.quantity = quantity;
    }
    public abstract void buy();
    public abstract void sell();
}
