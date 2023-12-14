package bg.tu_varna.sit.a2.f22621663.homework9.task1;

abstract class Room implements PriceCalculator {
    private double pricePerDay;
    private Exposure exposure;
    private boolean available;

    public Room(double pricePerDay, Exposure exposure) {
        this.pricePerDay = pricePerDay;
        this.exposure = exposure;
        this.available = true;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public Exposure getExposure() {
        return exposure;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public double calculateReservationPrice() {
        return calculateStayPrice() - discount();
    }
}
