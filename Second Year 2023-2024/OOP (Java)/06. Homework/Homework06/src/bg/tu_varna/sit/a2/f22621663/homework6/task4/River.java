package bg.tu_varna.sit.a2.f22621663.homework6.task4;

public class River extends WaterBody {
    private int speed;

    public River(String name, int depth, Fish[] fishPopulation, int speed) {
        super(name, depth, fishPopulation);
        this.speed = speed;
    }





    @Override
    public boolean isFloaty() {
        return getDepth() >= 3 && speed <= 30;
    }
    @Override
    public void calculateProduction() {
    }
}