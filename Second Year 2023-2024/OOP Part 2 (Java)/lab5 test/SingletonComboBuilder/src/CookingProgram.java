// Пример за използване на програмата
public class CookingProgram {
    public static void main(String[] args) {
        // Създаване на рецепта чрез Builder
        Dish dish = new Dish.Builder("Spaghetti Carbonara")
                .withDescription("Classic Italian pasta dish with eggs, cheese, pancetta, and pepper.")
                .build();

        // Използване на Singleton готвач за приготвяне на рецептата
        Chef chef = Chef.getInstance();
        chef.cook();
    }
}