package bg.tu_varna.sit.a2.f22621663.homework6.task4;

public class NonEdibleFish extends Fish implements Usage {
    private String threat;

    public NonEdibleFish(String name, int quantity, String threat) {
        super(name, quantity);
        this.threat = threat;
    }

    public String getThreat() {
        return threat;
    }



    @Override
    public boolean isProductable() {
        return false;
    }
}
