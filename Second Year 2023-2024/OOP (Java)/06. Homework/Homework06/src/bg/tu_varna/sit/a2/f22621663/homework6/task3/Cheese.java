package bg.tu_varna.sit.a2.f22621663.homework6.task3;

public class Cheese extends Item implements Food {
    private int gramsPerPackage;

    public Cheese(String name, int daysToExpire, int availableQuantity, int gramsPerPackage) {
        super(name, daysToExpire, availableQuantity);
        this.gramsPerPackage = gramsPerPackage;
    }





    @Override
    public boolean needsDelivery() {
        return getAvailableQuantity() < 10 && gramsPerPackage <= 400;
    }
}
