package bg.tu_varna.sit.a2.f22621663.homework7.task4;

abstract class WaterBody implements Usage {
    String name;
    double depth;
    Fish[] fishList;

    public WaterBody(String name, double depth) {
        this.name = name;
        this.depth = depth;
        this.fishList = new Fish[10];
    }




    public abstract boolean isFloaty();

    public abstract void calculateProduction();
}
