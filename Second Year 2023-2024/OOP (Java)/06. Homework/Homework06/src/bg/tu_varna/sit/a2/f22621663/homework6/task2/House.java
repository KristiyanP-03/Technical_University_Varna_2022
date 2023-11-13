package bg.tu_varna.sit.a2.f22621663.homework6.task2;

public class House extends Property {
    private int numberOfFloors;
    private boolean hasGarden;



    public House(double area, double price, boolean isForRent, int numberOfFloors, boolean hasGarden) {
        super(area, price, isForRent);
        this.numberOfFloors = numberOfFloors;
        this.hasGarden = hasGarden;
    }



    public int getNumberOfFloors() {
        return numberOfFloors;
    }
    public boolean hasGarden() {
        return hasGarden;
    }




    @Override
    public double calculateCommission(Property property) {
        if (isForRent() && hasGarden()) {
            return getPrice() * 0.08;
        } else if (!isForRent() && getArea() < 100) {
            return getPrice() * 0.05;
        } else {
            return getPrice() * 0.03;
        }
    }
}