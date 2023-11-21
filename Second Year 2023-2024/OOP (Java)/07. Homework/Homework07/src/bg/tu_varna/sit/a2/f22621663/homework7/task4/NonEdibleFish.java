package bg.tu_varna.sit.a2.f22621663.homework7.task4;

public class NonEdibleFish extends Fish {
    String threat;

    public NonEdibleFish(String name, double quantity, String threat) {
        super(name, quantity);
        this.threat = threat;
    }
}
