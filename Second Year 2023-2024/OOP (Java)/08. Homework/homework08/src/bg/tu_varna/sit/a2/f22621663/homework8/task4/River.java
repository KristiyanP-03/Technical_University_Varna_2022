package bg.tu_varna.sit.a2.f22621663.homework8.task4;

class River extends WaterBody {
    private double speed;

    public River(String name, double depth, double speed, Fish[] fishList) throws WaterBodyException {
        super(name, depth, fishList);
        this.speed = speed;
    }

    @Override
    public boolean isProductable() {
        for (Fish fish : fishList) {
            if (fish instanceof EdibleFish && ((EdibleFish) fish).percentOfYield > 0 && fish.quantity > 10) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isFloaty() {
        return (depth >= 3 && speed <= 30);
    }

    @Override
    public double calculateProduction() {
        double production = 0;
        for (Fish fish : fishList) {
            if (fish instanceof EdibleFish && ((EdibleFish) fish).percentOfYield > 0) {
                production += ((EdibleFish) fish).percentOfYield / 100 * fish.quantity;
            }
        }
        return production;
    }
}