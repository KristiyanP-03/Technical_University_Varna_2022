package bg.tu_varna.sit.a2.f22621663.homework6.task5;

public class AlcoholicBeverage extends Drink {
    private double vol;

    public AlcoholicBeverage(String name, double quantity, double serveQuantity, double vol) {
        super(name, quantity, serveQuantity);
        this.vol = vol;
    }
}
