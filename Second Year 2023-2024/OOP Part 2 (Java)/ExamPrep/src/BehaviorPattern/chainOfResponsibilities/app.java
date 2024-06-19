package BehaviorPattern.chainOfResponsibilities;


public class app {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        PizzaChain doughHandler = new DoughHandler();
        PizzaChain sauceHandler = new SauceHandler();
        doughHandler.setNextChain(sauceHandler);
        doughHandler.addIngredient(pizza);
        System.out.println(pizza);
    }
}
