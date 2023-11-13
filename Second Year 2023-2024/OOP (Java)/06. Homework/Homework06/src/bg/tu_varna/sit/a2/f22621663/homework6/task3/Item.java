package bg.tu_varna.sit.a2.f22621663.homework6.task3;

public abstract class Item implements Delivery {
    private String name;
    private int daysToExpire;
    private int availableQuantity;

    public Item(String name, int daysToExpire, int availableQuantity) {
        this.name = name;
        this.daysToExpire = daysToExpire;
        this.availableQuantity = availableQuantity;
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




    @Override
    public boolean needsDelivery() {
        return false;
    }
}