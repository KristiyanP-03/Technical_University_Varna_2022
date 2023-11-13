package bg.tu_varna.sit.a2.f22621663.homework6.task3;

public class Bread extends Item implements Food {
    private int whiteFlourPercentage;

    public Bread(String name, int daysToExpire, int availableQuantity, int whiteFlourPercentage) {
        super(name, daysToExpire, availableQuantity);
        this.whiteFlourPercentage = whiteFlourPercentage;
    }





    @Override
    public boolean needsDelivery() {
        return getDaysToExpire() < 5 && (whiteFlourPercentage > 75 || getAvailableQuantity() < 10);
    }
}
