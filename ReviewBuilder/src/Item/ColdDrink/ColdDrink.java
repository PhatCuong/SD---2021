package Item.ColdDrink;

import Item.Item;
import Packaging.Bottle;
import Packaging.Packing;

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
