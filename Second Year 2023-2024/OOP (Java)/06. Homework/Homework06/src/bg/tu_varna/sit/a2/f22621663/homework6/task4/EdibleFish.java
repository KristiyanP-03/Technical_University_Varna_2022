package bg.tu_varna.sit.a2.f22621663.homework6.task4;

public class EdibleFish extends Fish implements Usage {
    private double percentOfYield;

    public EdibleFish(String name, int quantity, double percentOfYield) {
        super(name, quantity);
        this.percentOfYield = percentOfYield;
    }



    @Override
    public boolean isProductable() {
        return percentOfYield >= 0.5;
    }
}
