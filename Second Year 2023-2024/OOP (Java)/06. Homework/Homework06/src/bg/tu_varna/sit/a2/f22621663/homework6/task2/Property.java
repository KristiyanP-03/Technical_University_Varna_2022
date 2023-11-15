package bg.tu_varna.sit.a2.f22621663.homework6.task2;

public abstract class Property implements Commission {
    private double area;
    private double price;
    private boolean isForRent;

    public Property(double area, double price, boolean isForRent) {
        this.area = area;
        this.price = price;
        this.isForRent = isForRent;
    }




    public double getArea() {
        return area;
    }
    public double getPrice() {
        return price;
    }
    public boolean isForRent() {
        return isForRent;
    }



    public abstract double calculateCommission(Property property);
}
