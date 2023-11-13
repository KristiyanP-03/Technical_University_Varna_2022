package bg.tu_varna.sit.a2.f22621663.homework6.task4;

public class Lake extends WaterBody {
    private int width;
    private int length;

    public Lake(String name, int depth, Fish[] fishPopulation, int width, int length) {
        super(name, depth, fishPopulation);
        this.width = width;
        this.length = length;
    }




    @Override
    public boolean isFloaty() {
        return getDepth() >= 5 && width >= 1000 && length >= 1000;
    }
    @Override
    public void calculateProduction() {
    }
}
