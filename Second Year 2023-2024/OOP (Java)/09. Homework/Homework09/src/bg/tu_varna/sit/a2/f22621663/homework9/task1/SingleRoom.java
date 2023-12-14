package bg.tu_varna.sit.a2.f22621663.homework9.task1;


class SingleRoom extends Room {
    private int days;

    public SingleRoom(double pricePerDay, Exposure exposure, int days) {
        super(pricePerDay, exposure);
        this.days = days;
    }

    public int getDays() {
        return days;
    }

    @Override
    public double calculateStayPrice() {
        double totalPrice = getPricePerDay() * getDays();
        if (getDays() > 3) {
            totalPrice *= 0.9;
        }
        return totalPrice;
    }

    @Override
    public double discount() {
        return 0;
    }

    @Override
    public String toString() {
        return "SingleRoom{" +
                "pricePerDay=" + getPricePerDay() +
                ", exposure=" + getExposure() +
                ", available=" + isAvailable() +
                ", days=" + days +
                '}';
    }
}
