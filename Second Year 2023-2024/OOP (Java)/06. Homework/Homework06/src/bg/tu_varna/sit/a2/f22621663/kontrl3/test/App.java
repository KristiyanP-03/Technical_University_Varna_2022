package bg.tu_varna.sit.a2.f22621663.kontrl3.test;

public class App {
    public static void main(String[] args) {
        Address address1 = new Address("к1", "у1", 1);
        Address address2 = new Address("к1", "у1", 1);

        System.out.println(address1.toString(address2));
    }
}
