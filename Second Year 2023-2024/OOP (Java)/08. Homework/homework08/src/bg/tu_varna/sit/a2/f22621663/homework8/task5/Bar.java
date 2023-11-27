package bg.tu_varna.sit.a2.f22621663.homework8.task5;

class Bar {
    private Drink[] drinks;

    public Bar(Drink[] drinks) {
        this.drinks = drinks;
    }

    public void orderDrink(String name, int units) {
        for (Drink drink : drinks) {
            if (drink.name.equals(name)) {
                drink.serve(units);
                return;
            }
        }
        System.out.println("Drink not found in the menu");
    }

    public void checkDeliveries() {
        for (Drink drink : drinks) {
            if (drink.needOfDelivery()) {
                System.out.println("Need delivery for " + drink.name);
                drink.deliver(20);
            }
        }
    }
}
