package bg.tu_varna.sit.a2.f22621663.homework7.task3;

public class Shop {
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
        int totalDaysToExpire = 0;
        for (Item item : items) {
            totalDaysToExpire += item.getDaysToExpire();
        }
        return (double) totalDaysToExpire / items.length;
    }




    
    public int getAvailableDrinksCount() {
        int count = 0;
        for (Item item : items) {
            if (item.getItemType() == ItemType.drink) {
                count += item.getAvailableQuantity();
            }
        }
        return count;
    }
}