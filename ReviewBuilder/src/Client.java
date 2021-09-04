import Burger.Burger;
import Burger.BurgerBuilder;

public class Client {
    public static void main(String args[]){
        BurgerBuilder burger = new BurgerBuilder();
        BurgerDirector burgerDirector = new BurgerDirector();

        burgerDirector.fullTopping(burger);
        burgerDirector.cheeseBurger(burger);

        //Custom Burger
        System.out.println("Custom Burger: ");
        Burger optionalBurger = new BurgerBuilder().addMeat(2).addCheese(3).addKetchup().deliver();
    }
}
