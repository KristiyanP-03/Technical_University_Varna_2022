package bg.tu_varna.sit.a2.f22621663.homework7.task3;

public class Water extends Item {
    private double mineralContent;

    public Water(String name, int daysToExpire, int availableQuantity, double mineralContent) {
        super(name, daysToExpire, availableQuantity, ItemType.drink);
        this.mineralContent = mineralContent;
    }





    @Override
    public boolean needsDelivery() {
        return getAvailableQuantity() < 30 || getDaysToExpire() < 20;
    }
}
