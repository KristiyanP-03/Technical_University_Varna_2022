package bg.tu_varna.sit.a2.f22621663.homework8.task3;

class Shop {
    private Item[] items;

    public Shop(Item[] items) {
        this.items = items;
    }

    public int getItemCountDelivery() {
        int count = 0;
        for (Item item : items) {
            if (item.needsDelivery()) {
                count++;
            }
        }
        return count;
    }

    public double getAverageDaysToExpire() {
        if (items.length == 0) {
            return 0;
        }

        int totalDays = 0;
        for (Item item : items) {
            totalDays += item.daysToExpire;
        }

        return (double) totalDays / items.length;
    }

    public int getAvailableDrinksCount() {
        int count = 0;
        for (Item item : items) {
            if (item.itemType == ItemType.drink) {
                count += item.availableQuantity;
            }
        }
        return count;
    }
}