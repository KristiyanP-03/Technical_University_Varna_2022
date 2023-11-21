package bg.tu_varna.sit.a2.f22621663.homework7.task4;

public class Lake extends WaterBody {
    double width;
    double length;

    public Lake(String name, double depth, double width, double length) {
        super(name, depth);
        this.width = width;
        this.length = length;
    }






    @Override
    public boolean isFloaty() {
        return (depth >= 5 && width >= 1000 && length >= 1000);
    }

    @Override
    public void calculateProduction() {
    }


    @Override
    public boolean isProductable() {
        return true;
    }
}
