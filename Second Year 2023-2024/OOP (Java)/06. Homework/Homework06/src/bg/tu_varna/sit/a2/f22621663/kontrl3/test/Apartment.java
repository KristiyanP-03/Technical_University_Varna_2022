package bg.tu_varna.sit.a2.f22621663.kontrl3.test;

class Apartment extends Property {
    private double area;
    private int floor;

    public Apartment(Address address, int yearOfConstruction, double taxAssessment, double area, int floor) {
        super(address, yearOfConstruction, taxAssessment);
        this.area = area;
        this.floor = floor;
    }





    @Override
    public double calculateTax() {
        double baseTax = super.calculateTax();
        double areaTax = area * 2;


        if (floor == 1) {
            areaTax *= 0.9;
        }


        return baseTax + areaTax;
    }







    @Override
    public double calculateCurrentPrice() {
        return 2 * taxAssessment * (yearOfConstruction / 2023);
    }
}
