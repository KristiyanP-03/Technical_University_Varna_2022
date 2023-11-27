package bg.tu_varna.sit.a2.f22621663.homework8.task3;

class Water extends Item {
    private double mineralContent;

    public Water(String name, int daysToExpire, int availableQuantity, double mineralContent) throws InvalidDataException {
        super(name, daysToExpire, availableQuantity, ItemType.drink);
        this.mineralContent = mineralContent;
    }




    @Override
    public boolean needsDelivery() {
        return (availableQuantity < 30 || daysToExpire < 20);
    }
}
