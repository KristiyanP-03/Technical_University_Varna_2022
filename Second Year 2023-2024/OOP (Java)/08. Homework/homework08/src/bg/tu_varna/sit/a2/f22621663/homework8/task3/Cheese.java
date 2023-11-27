package bg.tu_varna.sit.a2.f22621663.homework8.task3;

class Cheese extends Item {
    private int gramsPerPackage;

    public Cheese(String name, int daysToExpire, int availableQuantity, int gramsPerPackage) throws InvalidDataException {
        super(name, daysToExpire, availableQuantity, ItemType.food);
        this.gramsPerPackage = gramsPerPackage;
    }



    @Override
    public boolean needsDelivery() {
        return (availableQuantity < 10 && gramsPerPackage <= 400);
    }
}


