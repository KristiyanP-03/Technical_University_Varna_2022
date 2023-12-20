package bg.tu_varna.sit.a2.f22621663.homework10.task1;

import java.util.Objects;

abstract class Item implements Delivery, Comparable<Item> {
    protected ItemType itemType;
    protected double itemPrice;
    protected int availableQuantity;

    public Item(ItemType itemType, double itemPrice, int availableQuantity) {
        this.itemType = itemType;
        this.itemPrice = itemPrice;
        this.availableQuantity = availableQuantity;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Item item = (Item) obj;
        return Double.compare(item.itemPrice, itemPrice) == 0 &&
                availableQuantity == item.availableQuantity &&
                itemType == item.itemType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemType, itemPrice, availableQuantity);
    }

    @Override
    public int compareTo(Item o) {
        return Integer.compare(this.availableQuantity, o.availableQuantity);
    }

    @Override
    public boolean needsDelivery() {
        return false;
    }

    public abstract String getDescription();
}
