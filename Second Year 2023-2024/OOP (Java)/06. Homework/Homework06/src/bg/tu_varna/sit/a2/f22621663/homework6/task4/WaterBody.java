package bg.tu_varna.sit.a2.f22621663.homework6.task4;

public abstract class WaterBody implements Usage {
    private String name;
    private int depth;
    private Fish[] fishPopulation;

    public WaterBody(String name, int depth, Fish[] fishPopulation) {
        this.name = name;
        this.depth = depth;
        this.fishPopulation = fishPopulation;
    }



    public String getName() {
        return name;
    }
    public int getDepth() {
        return depth;
    }
    public Fish[] getFishPopulation() {
        return fishPopulation;
    }




    public abstract boolean isFloaty();

    public abstract void calculateProduction();





    @Override
    public boolean isProductable() {
        for (Fish fish : fishPopulation) {
            if (fish instanceof EdibleFish && ((EdibleFish) fish).isProductable()) {
                return true;
            }
        }
        return false;
    }
}