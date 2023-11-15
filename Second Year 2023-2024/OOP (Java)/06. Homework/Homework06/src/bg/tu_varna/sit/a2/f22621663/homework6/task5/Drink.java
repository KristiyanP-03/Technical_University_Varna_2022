package bg.tu_varna.sit.a2.f22621663.homework6.task5;

public class Drink implements Delivery, Serving {
    private String name;
    private double quantity;
    private double serveQuantity;

    public Drink(String name, double quantity, double serveQuantity) {
        this.name = name;
        this.quantity = quantity;
        this.serveQuantity = serveQuantity;
    }



    public String getName() {
        return name;
    }





    @Override
    public boolean needOfDelivery() {
        return quantity < 10;
    }




    @Override
    public void deliver(int deliveredQuantity) {
        quantity += deliveredQuantity;
    }





    @Override
    public void serve(int units) {
        if (quantity >= units * serveQuantity) {
            quantity -= units * serveQuantity;
            System.out.println("Сервирано е: " + units + "х " + name);
        } else {
            System.out.println("Няма достатъчно " + name + "!");
            System.out.println("Сервирано е: " + (int)(quantity / serveQuantity));
            quantity = 0;
        }
    }
}


