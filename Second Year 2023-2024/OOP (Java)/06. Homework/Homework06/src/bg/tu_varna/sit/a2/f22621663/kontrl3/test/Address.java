package bg.tu_varna.sit.a2.f22621663.kontrl3.test;

class Address {
    private String neighborhood;
    private String street;
    private int houseNumber;

    public Address(String neighborhood, String street, int houseNumber) {
        this.neighborhood = neighborhood;
        this.street = street;
        this.houseNumber = houseNumber;
    }




    public String getNeighborhood() {
        return neighborhood;
    }
    public String getStreet() {
        return street;
    }
    public int getHouseNumber() {
        return houseNumber;
    }

    public String toString(Address o) {
        if(this.neighborhood.equals(o.neighborhood) &&
                this.street.equals(o.street) &&
                this.houseNumber == o.houseNumber)
        {
            return "Квартал: " + this.neighborhood + "\n" + "Улица: " + this.street + " №" + this.houseNumber;
        }



        return "No match!";
    }
}