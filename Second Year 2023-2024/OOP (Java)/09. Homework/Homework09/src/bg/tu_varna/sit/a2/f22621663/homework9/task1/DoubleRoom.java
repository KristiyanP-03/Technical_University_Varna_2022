package bg.tu_varna.sit.a2.f22621663.homework9.task1;

class DoubleRoom extends Room {
    private int days;
    private boolean hasChildren;

    public DoubleRoom(double pricePerDay, Exposure exposure, int days, boolean hasChildren) {
        super(pricePerDay, exposure);
        this.days = days;
        this.hasChildren = hasChildren;
    }

    public int getDays() {
        return days;
    }

    public boolean hasChildren() {
        return hasChildren;
    }

    @Override
    public double calculateStayPrice() {
        double totalPrice = getPricePerDay() * getDays();
        totalPrice += 10;
        if (hasChildren && getDays() > 5) {
            totalPrice *= 0.85;
        }
        return totalPrice;
    }

    @Override
    public double discount() {
        return 0;
    }

    @Override
    public String toString() {
        return "DoubleRoom{" +
                "pricePerDay=" + getPricePerDay() +
                ", exposure=" + getExposure() +
                ", available=" + isAvailable() +
                ", days=" + days +
                ", hasChildren=" + hasChildren +
                '}';
    }
}
