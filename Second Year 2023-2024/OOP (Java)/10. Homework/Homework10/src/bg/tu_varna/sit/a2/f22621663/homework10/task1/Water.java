package bg.tu_varna.sit.a2.f22621663.homework10.task1;

class Water extends Item {
    private String name;
    private WaterType waterType;

    public Water(String name, WaterType waterType, double itemPrice, int availableQuantity) {
        super(ItemType.DRINKS, itemPrice, availableQuantity);
        this.name = name;
        this.waterType = waterType;
    }

    public String getName() {
        return name;
    }

    public WaterType getWaterType() {
        return waterType;
    }

    @Override
    public boolean needsDelivery() {
        return (waterType == WaterType.SODA && availableQuantity < 30) || availableQuantity < 15;
    }

    @Override
    public String getDescription() {
        return "Water: " + name + ", " + waterType;
    }
}
