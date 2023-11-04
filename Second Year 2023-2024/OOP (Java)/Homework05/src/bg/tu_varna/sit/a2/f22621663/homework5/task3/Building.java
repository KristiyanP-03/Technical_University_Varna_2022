package bg.tu_varna.sit.a2.f22621663.homework5.task3;

abstract class Building {
    protected String address;
    protected double width;
    protected double length;
    protected double height;

    public Building(String address, double width, double length, double height) {
        this.address = address;
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public abstract double calculateHeatedVolume();
    public abstract double calculateTotalArea();
}