package bg.tu_varna.sit.a2.f22621663.homework6.task3;

public class Water extends Item implements Drink {
    private int mineralContent;

    public Water(String name, int daysToExpire, int availableQuantity, int mineralContent) {
        super(name, daysToExpire, availableQuantity);
        this.mineralContent = mineralContent;
    }





    @Override
    public boolean needsDelivery() {
        return getAvailableQuantity() < 30 || getDaysToExpire() < 20;
    }
}
