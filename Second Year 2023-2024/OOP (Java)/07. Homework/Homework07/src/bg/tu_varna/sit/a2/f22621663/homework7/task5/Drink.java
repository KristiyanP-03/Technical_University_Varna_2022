package bg.tu_varna.sit.a2.f22621663.homework7.task5;

public abstract class Drink implements Delivery, Serving {
    String name;
    double quantity;
    double serveQuantity;

    public Drink(String name, double quantity, double serveQuantity) {
        this.name = name;
        this.quantity = quantity;
        this.serveQuantity = serveQuantity;
    }



    public String getName() {
        return name;
    }




    @Override
    public void deliver(double quantity) {
        this.quantity += quantity;
    }
}



