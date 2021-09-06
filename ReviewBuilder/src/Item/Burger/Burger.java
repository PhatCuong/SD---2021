package Item.Burger;

import Item.Item;
import Packaging.Packing;
import Packaging.Wrapper;

public abstract class Burger implements Item{

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
