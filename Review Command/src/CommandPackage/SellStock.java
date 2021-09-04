package CommandPackage;

import StockPackage.StockInterface;

public class SellStock implements OrderInterface {

    //Important!!
    private StockInterface stock;

    public SellStock(StockInterface stock){
        this.stock = stock;
    }
    @Override
    public void execute() {
        stock.sell();
    }
}
