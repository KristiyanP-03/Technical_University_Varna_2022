package bg.tu_varna.sit.a2.f22621663.homework10.task1;

class Butter extends Item {
    private int packing;
    private double butterContent;

    public Butter(int packing, double butterContent, double itemPrice, int availableQuantity) {
        super(ItemType.FOOD, itemPrice, availableQuantity);
        this.packing = packing;
        this.butterContent = butterContent;
    }

    public int getPacking() {
        return packing;
    }

    public double getButterContent() {
        return butterContent;
    }

    @Override
    public boolean needsDelivery() {
        return (packing < 250 && availableQuantity < 20) || availableQuantity < 30;
    }

    @Override
    public String getDescription() {
        return "Butter: " + packing + "g, " + butterContent + "%";
    }
}
