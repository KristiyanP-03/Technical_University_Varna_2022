package bg.tu_varna.sit.a2.f22621663.homework7.task4;

public class EdibleFish extends Fish {
    double percentOfYield;

    public EdibleFish(String name, double quantity, double percentOfYield) {
        super(name, quantity);
        this.percentOfYield = percentOfYield;
    }
}
