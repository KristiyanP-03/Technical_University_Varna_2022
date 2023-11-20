package bg.tu_varna.sit.a2.f22621663.kontrl3.test;

class House extends Property {
    private double areaOfHouse;
    private double areaOfLand;

    public House(Address address, int yearOfConstruction, double taxAssessment, double areaOfHouse, double areaOfLand) {
        super(address, yearOfConstruction, taxAssessment);
        this.areaOfHouse = areaOfHouse;
        this.areaOfLand = areaOfLand;
    }





    @Override
    public double calculateTax() {
        double baseTax = super.calculateTax();

        double houseTax = areaOfHouse * 2;
        double landTax = areaOfLand * 0.05;

        return baseTax + houseTax + landTax;
    }





    @Override
    public double calculateCurrentPrice() {
        return 2 * taxAssessment * (yearOfConstruction / 2023);
    }
}