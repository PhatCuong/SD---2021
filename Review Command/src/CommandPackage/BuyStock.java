package CommandPackage;

import StockPackage.StockInterface;

public class BuyStock  implements OrderInterface{

    //important
    private StockInterface stock;

    public BuyStock(StockInterface stock){
        this.stock = stock;
    }
    @Override
    public void execute() {
        stock.buy();
    }
}
