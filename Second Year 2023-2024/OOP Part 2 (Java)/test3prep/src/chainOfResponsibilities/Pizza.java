package chainOfResponsibilities;

import java.util.ArrayList;
import java.util.List;


class Pizza {
    private List<String> ingredients = new ArrayList<>();

    public void addIngredient(String ingredient) {
        ingredients.add(ingredient);
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Pizza with: " + String.join(", ", ingredients);
    }
}
