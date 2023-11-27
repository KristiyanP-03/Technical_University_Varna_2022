package bg.tu_varna.sit.a2.f22621663.homework8.task3;

class Bread extends Item {
    private int whiteFlourPercentage;

    public Bread(String name, int daysToExpire, int availableQuantity, int whiteFlourPercentage) throws InvalidDataException {
        super(name, daysToExpire, availableQuantity, ItemType.food);
        this.whiteFlourPercentage = whiteFlourPercentage;
    }

    @Override
    public boolean needsDelivery() {
        return (daysToExpire < 5 && (whiteFlourPercentage > 75 || availableQuantity < 10));
    }
}
