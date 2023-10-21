package bg.tu_varna.sit.b3.f22621663.homework3.task1;

public class Machine {
    private double price;

    Machine(double price){
        this.price = price;
    }

    //метод за четене
    public double getPrice() {
        return price;
    }

    //метод за запис
    public void setPrice(double price) {
        this.price = price;
    }
}
