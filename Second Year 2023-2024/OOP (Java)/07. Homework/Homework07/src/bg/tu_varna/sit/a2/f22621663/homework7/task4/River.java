package bg.tu_varna.sit.a2.f22621663.homework7.task4;

public class River extends WaterBody {
    double speed;

    public River(String name, double depth, double speed) {
        super(name, depth);
        this.speed = speed;
    }




    @Override
    public boolean isFloaty() {
        return (depth >= 3 && speed <= 30);
    }

    @Override
    public void calculateProduction() {
    }

    @Override
    public boolean isProductable() {
        return false;
    }
}