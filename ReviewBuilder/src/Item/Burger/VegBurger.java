package Item.Burger;

public class VegBurger extends Burger{
    @Override
    public String name() {
        return "Veg burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
