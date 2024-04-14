package bg.tu_varna.sit.а2.f22621663;

import bg.tu_varna.sit.а2.f22621663.interfaces.RecipeComponent;

import java.util.List;

public class Recipe implements RecipeComponent {
    private String name;
    private List<Ingredient> ingredients;
    private long cookingTime;
    private String cookingMethod;

    public Recipe(String name, List<Ingredient> ingredients, long cookingTime, String cookingMethod) {
        this.name = name;
        this.ingredients = ingredients;
        this.cookingTime = cookingTime;
        this.cookingMethod = cookingMethod;
    }

    public void display() {
        System.out.println("Recipe: " + name);
        System.out.println("Ingredients:");
        for (Ingredient ingredient : ingredients) {
            ingredient.display();
        }
        System.out.println("Cooking time: " + cookingTime + " milliseconds");
        System.out.println("Cooking method: " + cookingMethod);
    }
}
