package bg.tu_varna.sit.a2.f22621663.homework7.task5;

public class AlcoholicBeverage extends Drink {
    double vol;

    public AlcoholicBeverage(String name, double quantity, double serveQuantity, double vol) {
        super(name, quantity, serveQuantity);
        this.vol = vol;
    }




    public boolean isProper(int age) {
        if ((age >= 18 && age < 21) || age >= 70) {
            return vol < 10;
        } else {
            return true;
        }
    }




    @Override
    public boolean needOfDelivery() {
        return quantity < 5;
    }




    @Override
    public void serve(int units) {
        if (units * serveQuantity <= quantity) {
            System.out.println("Serving " + units + " units of " + name);
            quantity -= units * serveQuantity;
        } else {
            System.out.println("Not enough quantity available for serving.");
        }
    }
}

