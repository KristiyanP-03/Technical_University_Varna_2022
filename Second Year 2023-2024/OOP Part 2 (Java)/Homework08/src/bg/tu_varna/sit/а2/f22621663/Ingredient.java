package bg.tu_varna.sit.а2.f22621663;


public class Ingredient {
    private String name;
    private double quantityPerServing;

    public Ingredient(String name, double quantityPerServing) {
        this.name = name;
        this.quantityPerServing = quantityPerServing;
    }

    public void display() {
        System.out.println("- " + name + ": " + quantityPerServing + " units per serving");
    }
}
