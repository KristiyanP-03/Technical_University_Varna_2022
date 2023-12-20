package bg.tu_varna.sit.a2.f22621663.homework10.task1;

class Biscuits extends Item {
    private String name;

    public Biscuits(String name, double itemPrice, int availableQuantity) {
        super(ItemType.FOOD, itemPrice, availableQuantity);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean needsDelivery() {
        return availableQuantity < 5;
    }

    @Override
    public String getDescription() {
        return "Biscuits: " + name;
    }
}
