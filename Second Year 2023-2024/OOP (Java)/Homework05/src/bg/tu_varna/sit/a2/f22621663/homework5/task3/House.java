package bg.tu_varna.sit.a2.f22621663.homework5.task3;

class House extends Building {
    private int floors;
    private String ownerName;

    public House(String address, double width, double length, double height, int floors, String ownerName) {
        super(address, width, length, height);
        this.floors = floors;
        this.ownerName = ownerName;
    }

    @Override
    public double calculateHeatedVolume() {
        double floorArea = width * length;
        double heatedVolume = floorArea * floors * height * 0.75; // 25% deduction for unheated areas
        return heatedVolume;
    }

    @Override
    public double calculateTotalArea() {
        double floorArea = width * length;
        return floorArea * floors;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
