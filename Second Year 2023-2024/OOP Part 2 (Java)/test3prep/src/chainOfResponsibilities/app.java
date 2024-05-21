package chainOfResponsibilities;


public class app {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();

        PizzaChain doughHandler = new DoughHandler();
        PizzaChain sauceHandler = new SauceHandler();
        PizzaChain cheeseHandler = new CheeseHandler();


        doughHandler.setNextChain(sauceHandler);
        sauceHandler.setNextChain(cheeseHandler);


        doughHandler.addIngredient(pizza);


        System.out.println(pizza);
    }
}
