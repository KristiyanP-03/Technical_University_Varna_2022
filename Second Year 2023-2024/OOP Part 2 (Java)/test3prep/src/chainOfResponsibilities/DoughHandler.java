package chainOfResponsibilities;

// Клас за добавяне на тесто
class DoughHandler implements PizzaChain {
    private PizzaChain nextChain;

    @Override
    public void setNextChain(PizzaChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void addIngredient(Pizza pizza) {
        if (!pizza.getIngredients().contains("Dough")) {
            pizza.addIngredient("Dough");
            System.out.println("Dough added.");
        }
        if (nextChain != null) {
            nextChain.addIngredient(pizza);
        }
    }
}
