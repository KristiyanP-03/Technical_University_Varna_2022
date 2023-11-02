package bg.tu_varna.sit.b3.f22621663.homework3.task5;

public class Car {
    private String brand;
    private String model;
    private int color;
    private int power;
    private String engineType;
    private String gearboxType;
    private int yearOfManufacture;
    private int mileage;


    public Car(String brand, String model, int color, int power, String engineType, String gearboxType, int yearOfManufacture) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.power = power;
        this.engineType = engineType;
        this.gearboxType = gearboxType;
        this.yearOfManufacture = yearOfManufacture;
        this.mileage = 0;
    }
    public Car(String brand, String model, int power, String engineType, String gearboxType, int yearOfManufacture) {
        this(brand, model, 0, power, engineType, gearboxType, yearOfManufacture);
    }


    public int getColor() {
        return color;
    }
    public int getMileage() {
        return mileage;
    }


    public void setColor(int color) {
        this.color = color;
    }
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}