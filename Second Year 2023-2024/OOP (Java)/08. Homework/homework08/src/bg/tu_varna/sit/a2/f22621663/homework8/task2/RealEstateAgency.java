package bg.tu_varna.sit.a2.f22621663.homework8.task2;

class RealEstateAgency {
    private String name;
    private Property[] properties;

    public RealEstateAgency(String name, Property[] properties) {
        this.name = name;
        this.properties = properties;
    }





    public double calculateTotalExpectedCommission() {
        double totalCommission = 0;
        for (Property property : properties) {
            totalCommission += property.calculateCommission();
        }
        return totalCommission;
    }





    public int getPropertiesForSale() {
        int count = 0;
        for (Property property : properties) {
            if (property.getPropertyType() == PropertyType.sale) {
                count++;
            }
        }
        return count;
    }
}
