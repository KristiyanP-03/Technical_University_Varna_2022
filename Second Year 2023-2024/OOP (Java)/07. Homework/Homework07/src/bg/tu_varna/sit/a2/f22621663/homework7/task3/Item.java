package bg.tu_varna.sit.a2.f22621663.homework7.task3;

public abstract class Item implements Delivery {
    private String name;
    private int daysToExpire;
    private int availableQuantity;
    private ItemType itemType;

    public Item(String name, int daysToExpire, int availableQuantity, ItemType itemType) {
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
}