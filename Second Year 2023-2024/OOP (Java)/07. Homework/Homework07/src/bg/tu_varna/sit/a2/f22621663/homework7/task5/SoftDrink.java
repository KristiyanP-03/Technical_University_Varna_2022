package bg.tu_varna.sit.a2.f22621663.homework7.task5;

public class SoftDrink extends Drink {
    boolean isSugarFree;
    String drinkFragrance;

    public SoftDrink(String name, double quantity, double serveQuantity, boolean isSugarFree, String drinkFragrance) {
        super(name, quantity, serveQuantity);
        this.isSugarFree = isSugarFree;
        this.drinkFragrance = drinkFragrance;
    }





    @Override
    public boolean needOfDelivery() {
        return quantity < 10;
    }





    @Override
    public void serve(int units) {
        if (units * serveQuantity <= quantity) {
            System.out.println("Serving " + units + " units of " + name);
            quantity -= units * serveQuantity;
        } else {
            System.out.println("Not enough quantity available for serving.");
        }
    }
}