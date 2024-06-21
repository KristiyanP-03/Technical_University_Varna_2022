package BehaviorPattern.chainOfResponsibilities;


interface PizzaChain {
    void setNextChain(PizzaChain nextChain);
    void addIngredient(Pizza pizza);
}
