package bg.tu_varna.sit.a2.f22621663.homework8.task4;

class Lake extends WaterBody {
    private double width;
    private double length;

    public Lake(String name, double depth, double width, double length, Fish[] fishList) throws WaterBodyException {
        super(name, depth, fishList);
        this.width = width;
        this.length = length;
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
        return (depth >= 5 && width >= 1000 && length >= 1000);
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

