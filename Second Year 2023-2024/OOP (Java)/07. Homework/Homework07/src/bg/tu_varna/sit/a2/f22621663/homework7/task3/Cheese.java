package bg.tu_varna.sit.a2.f22621663.homework7.task3;

public class Cheese extends Item {
    private int gramsPerPackage;

    public Cheese(String name, int daysToExpire, int availableQuantity, int gramsPerPackage) {
        super(name, daysToExpire, availableQuantity, ItemType.food);
        this.gramsPerPackage = gramsPerPackage;
    }





    @Override
    public boolean needsDelivery() {
        return getAvailableQuantity() < 10 && gramsPerPackage <= 400;
    }
}

