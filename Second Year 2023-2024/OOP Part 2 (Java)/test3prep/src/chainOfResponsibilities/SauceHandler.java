package chainOfResponsibilities;

// Клас за добавяне на сос
class SauceHandler implements PizzaChain {
    private PizzaChain nextChain;

    @Override
    public void setNextChain(PizzaChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void addIngredient(Pizza pizza) {
        if (!pizza.getIngredients().contains("Sauce")) {
            pizza.addIngredient("Sauce");
            System.out.println("Sauce added.");
        }
        if (nextChain != null) {
            nextChain.addIngredient(pizza);
        }
    }
}
