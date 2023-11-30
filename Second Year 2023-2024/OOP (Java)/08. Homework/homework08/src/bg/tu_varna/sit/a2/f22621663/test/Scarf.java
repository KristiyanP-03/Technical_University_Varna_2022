package bg.tu_varna.sit.a2.f22621663.test;

class Scarf extends Knitting {
    double length;
    double width;
    double woolPercentage;

    public Scarf(Craftman craftman, String name, Content content, double price, double thickness,
                 double length, double width, double woolPercentage) throws KnittingException {

        super(craftman, name, content, price, thickness);
        this.length = length;
        this.width = width;
        this.woolPercentage = woolPercentage;
    }




    @Override
    public double calculateMaterial() {
        return length * width * thickness * 0.2;
    }




    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(super.toString());

        result.append(String.format(", length: %.2f, width: %.2f, wool percentage: %.2f%%", length, width, woolPercentage));
        return result.toString();
    }
}