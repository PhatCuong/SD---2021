import Packaging.Bottle;
import Packaging.Wrapper;

public class Client {
    public static void main(String args[]){
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

    }
}
