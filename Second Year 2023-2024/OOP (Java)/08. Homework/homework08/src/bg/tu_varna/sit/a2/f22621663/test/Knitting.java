package bg.tu_varna.sit.a2.f22621663.test;

public abstract class Knitting implements MaterialNecessity {
    Craftman craftman;
    String name;
    Content content;
    double price;
    double thickness;



    public Knitting(Craftman craftman, String name, Content content, double price, double thickness) throws KnittingException {
        if (price < 0 || thickness < 0) {
            throw new KnittingException("Invalid!");
        }

        this.craftman = craftman;
        this.name = name;
        this.content = content;
        this.price = price;
        this.thickness = thickness;
    }




    @Override
    public double calculateMaterial() {
        return 0;
    }




    @Override
    public String toString() {
        return String.format("Craftman: %s %s, Name: %s, Content: %s, Price: %.2f, Thickness: %.2f",
                craftman.firstName, craftman.lastName, name, content, price, thickness);
    }
}
