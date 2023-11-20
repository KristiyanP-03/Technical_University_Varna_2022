package bg.tu_varna.sit.a2.f22621663.kontrl3.test;

class City {
    private Property[] properties;

    public City(Property[] properties) {
        this.properties = properties;
    }




    public double calculateAllTaxes() {
        double totalTaxes = 0;

        for (Property property : properties) {
            totalTaxes += property.calculateTax();
        }

        return totalTaxes;
    }






    public Address getMaxPricePropertyAddress() {
        double maxPrice = 99999999999.99;
        Address maxPriceAddress = null;


        for (Property property : properties) {
            double currentPrice = property.calculateCurrentPrice();

            if (currentPrice > maxPrice) {
                maxPrice = currentPrice;
                maxPriceAddress = property.address;
            }
        }


        return maxPriceAddress;
    }
}
