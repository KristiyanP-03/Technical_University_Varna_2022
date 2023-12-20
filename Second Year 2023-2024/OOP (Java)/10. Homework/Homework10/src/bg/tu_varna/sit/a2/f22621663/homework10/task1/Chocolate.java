package bg.tu_varna.sit.a2.f22621663.homework10.task1;

class Chocolate extends Item {
    private String name;
    private double cocoaContent;

    public Chocolate(String name, double cocoaContent, double itemPrice, int availableQuantity) {
        super(ItemType.FOOD, itemPrice, availableQuantity);
        this.name = name;
        this.cocoaContent = cocoaContent;
    }

    public String getName() {
        return name;
    }

    public double getCocoaContent() {
        return cocoaContent;
    }

    @Override
    public boolean needsDelivery() {
        return availableQuantity < 10;
    }

    @Override
    public String getDescription() {
        return "Chocolate: " + name + ", " + cocoaContent + "% cocoa";
    }
}
