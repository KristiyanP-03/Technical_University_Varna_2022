package bg.tu_varna.sit.a2.f22621663.homework5.task3;

class Block extends Building {
    private int entrances;
    private int apartmentsPerEntrance;

    public Block(String address, double width, double length, int entrances, int apartmentsPerEntrance) {
        super(address, width, length, 2.45); // The height is fixed for apartments
        this.entrances = entrances;
        this.apartmentsPerEntrance = apartmentsPerEntrance;
    }

    @Override
    public double calculateHeatedVolume() {
        double apartmentArea = width * length;
        double heatedVolume = 2.45 * apartmentArea * apartmentsPerEntrance * entrances * 0.9; // 10% deduction for unheated areas
        return heatedVolume;
    }

    @Override
    public double calculateTotalArea() {
        double apartmentArea = width * length;
        return apartmentArea * apartmentsPerEntrance * entrances;
    }
}