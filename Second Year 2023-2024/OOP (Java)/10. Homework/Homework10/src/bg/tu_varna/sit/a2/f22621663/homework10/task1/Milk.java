package bg.tu_varna.sit.a2.f22621663.homework10.task1;

class Milk extends Item {
    private String name;
    private int daysToExpire;

    public Milk(String name, int daysToExpire, double itemPrice, int availableQuantity) {
        super(ItemType.DRINKS, itemPrice, availableQuantity);
        this.name = name;
        this.daysToExpire = daysToExpire;
    }

    public String getName() {
        return name;
    }

    public int getDaysToExpire() {
        return daysToExpire;
    }

    @Override
    public boolean needsDelivery() {
        return daysToExpire < 7 && availableQuantity < 15;
    }

    @Override
    public String getDescription() {
        return "Milk: " + name + ", " + daysToExpire + " days to expire";
    }
}
