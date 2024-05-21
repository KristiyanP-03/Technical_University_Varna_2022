package chainOfResponsibilities;

// Клас за добавяне на сирене
class CheeseHandler implements PizzaChain {
    private PizzaChain nextChain;

    @Override
    public void setNextChain(PizzaChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void addIngredient(Pizza pizza) {
        if (!pizza.getIngredients().contains("Cheese")) {
            pizza.addIngredient("Cheese");
            System.out.println("Cheese added.");
        }
        if (nextChain != null) {
            nextChain.addIngredient(pizza);
        }
    }
}
