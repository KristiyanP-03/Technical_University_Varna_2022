package bg.tu_varna.sit.b3.f22621663.homework3.task4;

public class Ticket {
    private String performanceName;
    protected double price;


    public Ticket(String performanceName, double price) {
        this.performanceName = performanceName;
        this.price = price;
    }


    public double getPrice() {
        return price;
    }


    public void setPrice(double price) {
        this.price = price;
    }
}