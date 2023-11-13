package bg.tu_varna.sit.a2.f22621663.homework6.task3;

public class Milk extends Item implements Food {
    private double fatPercentage;

    public Milk(String name, int daysToExpire, int availableQuantity, double fatPercentage) {
        super(name, daysToExpire, availableQuantity);
        this.fatPercentage = fatPercentage;
    }





    @Override
    public boolean needsDelivery() {
        return getDaysToExpire() <= 15 && getAvailableQuantity() < 10 && fatPercentage > 2;
    }
}