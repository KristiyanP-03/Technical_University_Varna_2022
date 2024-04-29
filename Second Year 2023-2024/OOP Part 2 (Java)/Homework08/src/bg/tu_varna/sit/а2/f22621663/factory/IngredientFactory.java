package bg.tu_varna.sit.а2.f22621663.factory;

import bg.tu_varna.sit.а2.f22621663.Ingredient;

import java.util.HashMap;
import java.util.Map;


public class IngredientFactory {
    private static final Map<String, Ingredient> ingredientsCache = new HashMap<>();

    public static Ingredient getIngredient(String name, double quantityPerServing) {
        Ingredient ingredient = ingredientsCache.get(name);
        if (ingredient == null) {
            ingredient = new Ingredient(name, quantityPerServing);
            ingredientsCache.put(name, ingredient);
        }
        return ingredient;
    }
}
