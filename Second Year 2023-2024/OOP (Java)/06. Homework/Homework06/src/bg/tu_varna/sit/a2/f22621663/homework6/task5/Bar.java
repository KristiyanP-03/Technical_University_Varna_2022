package bg.tu_varna.sit.a2.f22621663.homework6.task5;

public class Bar {
    private Drink[] drinks;

    public Bar(Drink[] drinks) {
        this.drinks = drinks;
    }




    public void checkAndDeliver() {
        for (Drink drink : drinks) {
            if (drink.needOfDelivery()) {
                drink.deliver(20);
                System.out.println("Доставка на: " + drink.getName());
            }
        }
    }



    public void serveDrink(String name, int units) {
        for (Drink drink : drinks) {
            if (drink.getName().equals(name)) {
                drink.serve(units);
                break;
            }
        }
    }
}