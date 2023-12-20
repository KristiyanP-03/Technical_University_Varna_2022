package bg.tu_varna.sit.a2.f22621663.homework10.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Shop {
    private List<Item> items;

    public Shop() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public int countItemsForDelivery() {
        return (int) items.stream().filter(Item::needsDelivery).count();
    }

    public double calculateItemsPrice() {
        return items.stream().mapToDouble(Item::getItemPrice).sum();
    }

    public Item getItemWithMostAvailableQuantity() {
        return Collections.max(items);
    }

    public ItemType getItemTypeWithLeastQuantity() {
        return items.stream()
                .min(Comparator.comparingInt(Item::getAvailableQuantity))
                .map(Item::getItemType)
                .orElse(null);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "items=" + items +
                '}';
    }
}
