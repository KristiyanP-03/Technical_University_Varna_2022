package bg.tu_varna.sit.a2.f22621663.homework8.task4;

class NonEdibleFish extends Fish {
    protected String threat;

    public NonEdibleFish(String name, double quantity, String threat) {
        super(name, quantity);
        this.threat = threat;
    }
}
