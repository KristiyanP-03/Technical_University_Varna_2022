package bg.tu_varna.sit.a2.f22621663.homework8.task5;

class Drink implements Delivery, Serving {
    protected String name;
    protected double quantity;
    protected double serveQuantity;

    public Drink(String name, double quantity, double serveQuantity) {
        this.name = name;
        this.quantity = quantity;
        this.serveQuantity = serveQuantity;
    }

    @Override
    public boolean needOfDelivery() {
        return quantity < 10;
    }

    @Override
    public void deliver(double deliveredQuantity) {
        quantity += deliveredQuantity;
    }

    @Override
    public void serve(int units) {
        if (quantity >= units * serveQuantity) {
            System.out.println("Serving " + units + " units of " + name);
            quantity -= units * serveQuantity;
        } else {
            System.out.println("Not enough quantity to serve " + units + " units of " + name);
        }
    }
}


