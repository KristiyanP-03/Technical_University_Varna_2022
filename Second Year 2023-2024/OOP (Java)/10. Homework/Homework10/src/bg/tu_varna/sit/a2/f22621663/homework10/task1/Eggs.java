package bg.tu_varna.sit.a2.f22621663.homework10.task1;

class Eggs extends Item {
    private int numberInPack;

    public Eggs(int numberInPack, double itemPrice, int availableQuantity) {
        super(ItemType.FOOD, itemPrice, availableQuantity);
        this.numberInPack = numberInPack;
    }

    public int getNumberInPack() {
        return numberInPack;
    }

    @Override
    public boolean needsDelivery() {
        return availableQuantity < 15;
    }

    @Override
    public String getDescription() {
        return "Eggs: " + numberInPack + " in a pack";
    }
}
