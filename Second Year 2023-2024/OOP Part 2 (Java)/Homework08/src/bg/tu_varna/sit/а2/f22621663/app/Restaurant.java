package bg.tu_varna.sit.а2.f22621663.app;
import bg.tu_varna.sit.а2.f22621663.Order;
import bg.tu_varna.sit.а2.f22621663.Recipe;
import bg.tu_varna.sit.а2.f22621663.factory.IngredientFactory;

import java.util.List;

public class Restaurant {
    public static void main(String[] args) {

        Recipe saladRecipe = new Recipe("Salad", List.of(
                IngredientFactory.getIngredient("Lettuce", 100),
                IngredientFactory.getIngredient("Tomato", 50),
                IngredientFactory.getIngredient("Cucumber", 50)
        ), 600000, "Mix all ingredients together.");

        Recipe soupRecipe = new Recipe("Soup", List.of(
                IngredientFactory.getIngredient("Carrot", 100),
                IngredientFactory.getIngredient("Potato", 100),
                IngredientFactory.getIngredient("Onion", 50)
        ), 1800000, "Boil all ingredients in water.");


        Order order = new Order("First order");
        order.addDish(saladRecipe);
        order.addDish(soupRecipe);


        order.display();
    }
}
