package bg.tu_varna.sit.a2.f22621663.homework8.task4;

abstract class WaterBody implements Usage {
    protected String name;
    protected double depth;
    protected Fish[] fishList;

    public WaterBody(String name, double depth, Fish[] fishList) throws WaterBodyException {
        if (depth < 0) {
            throw new WaterBodyException("Дълбочината не може да бъде отрицателна величина");
        }
        this.name = name;
        this.depth = depth;
        this.fishList = fishList;
    }

    @Override
    public abstract boolean isProductable();

    public abstract boolean isFloaty();

    public abstract double calculateProduction();
}