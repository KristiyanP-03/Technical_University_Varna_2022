package bg.tu_varna.sit.a2.f22621663.homework8.task4;

class EdibleFish extends Fish {
    protected double percentOfYield;

    public EdibleFish(String name, double quantity, double percentOfYield) {
        super(name, quantity);
        this.percentOfYield = percentOfYield;
    }
}
