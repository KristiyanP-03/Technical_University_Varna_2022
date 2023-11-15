package bg.tu_varna.sit.a2.f22621663.homework6.task5;

public class SoftDrink extends Drink {
    private boolean isSugarFree;

    public SoftDrink(String name, double quantity, double serveQuantity, boolean isSugarFree) {
        super(name, quantity, serveQuantity);
        this.isSugarFree = isSugarFree;
    }
}