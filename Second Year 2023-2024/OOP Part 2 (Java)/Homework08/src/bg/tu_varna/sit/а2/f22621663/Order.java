package bg.tu_varna.sit.а2.f22621663;

import bg.tu_varna.sit.а2.f22621663.interfaces.RecipeComponent;

import java.util.ArrayList;
import java.util.List;


public class Order implements RecipeComponent {
    private String name;
    private List<RecipeComponent> dishes;

    public Order(String name) {
        this.name = name;
        this.dishes = new ArrayList<>();
    }

    public void addDish(RecipeComponent dish) {
        dishes.add(dish);
    }

    public void removeDish(RecipeComponent dish) {
        dishes.remove(dish);
    }

    public void display() {
        System.out.println("Order: " + name);
        System.out.println("Dishes:");
        for (RecipeComponent dish : dishes) {
            dish.display();
        }
    }
}
