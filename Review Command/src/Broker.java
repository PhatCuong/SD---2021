import CommandPackage.OrderInterface;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<OrderInterface> orderList = new ArrayList<>();

    public void takeOrder(OrderInterface orderInterface){
        orderList.add(orderInterface);
    }

    public void placeOrder(){
        for(OrderInterface order : orderList){
            order.execute();
        }
        orderList.clear();
    }
}
