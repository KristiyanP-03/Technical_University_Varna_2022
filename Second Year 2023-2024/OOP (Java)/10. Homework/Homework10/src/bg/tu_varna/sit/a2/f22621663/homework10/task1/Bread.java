package bg.tu_varna.sit.a2.f22621663.homework10.task1;

class Bread extends Item {
    private String name;

    public Bread(String name, double itemPrice, int availableQuantity) {
        super(ItemType.FOOD, itemPrice, availableQuantity);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean needsDelivery() {
        return availableQuantity < 15;
    }

    @Override
    public String getDescription() {
        return "Bread: " + name;
    }
}
