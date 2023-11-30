package bg.tu_varna.sit.a2.f22621663.test;

class Hat extends Knitting {
    double diameter;
    double height;

    public Hat(Craftman craftman, String name, Content content, double price, double thickness,
               double diameter, double height) throws KnittingException {

        super(craftman, name, content, price, thickness);
        this.diameter = diameter;
        this.height = height;
    }



    @Override
    public double calculateMaterial() {
        return diameter * height * thickness * Math.PI * 0.3;
    }




    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        result.append(String.format("craftman: %s %s, name: %s, content: %s, price: %.2f, thickness: %.2f",
                craftman.firstName, craftman.lastName, name, content, price, thickness));


        return result.toString();
    }
}

