package bg.tu_varna.sit.a2.f22621663.homework8.task3;

public abstract class Item implements Delivery {
    private String name;

    int daysToExpire;
    int availableQuantity;
    ItemType itemType;

    public Item(String name, int daysToExpire, int availableQuantity, ItemType itemType) throws InvalidDataException {
        if (daysToExpire <= 0 || availableQuantity < 0) {
            throw new InvalidDataException("Invalid data for item");
        }
        this.name = name;
        this.daysToExpire = daysToExpire;
        this.availableQuantity = availableQuantity;
        this.itemType = itemType;
    }





    public String getName() {
        return name;
    }

    public int getDaysToExpire() {
        return daysToExpire;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public ItemType getItemType() {
        return itemType;
    }


    @Override
    public abstract boolean needsDelivery();
}