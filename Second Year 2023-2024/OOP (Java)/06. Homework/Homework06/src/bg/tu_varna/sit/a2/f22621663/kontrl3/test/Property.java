package bg.tu_varna.sit.a2.f22621663.kontrl3.test;

abstract class Property implements Taxing {
    protected Address address;
    protected int yearOfConstruction;
    protected double taxAssessment;



    public Property(Address address, int yearOfConstruction, double taxAssessment) {
        this.address = address;
        this.yearOfConstruction = yearOfConstruction;
        this.taxAssessment = taxAssessment;
    }





    public abstract double calculateCurrentPrice();




//    public boolean equals(Property o) {
//        return this..equals(o.) &&
//                this..equals(o.) &&
//                this. == o.;
//    }



    @Override
    public double calculateTax() {
        return taxAssessment * 0.001;
    }

}