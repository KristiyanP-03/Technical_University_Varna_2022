package bg.tu_varna.sit.a2.f22621663.test;

public class Application {
    public static void main(String[] args) {
        Craftman cf1 = new Craftman("Ivan", "Ivanov");
        Craftman cf2 = new Craftman("Ivanov", "Ivan");



        try {
            Hat hat = new Hat(cf1, "hat", Content.WOOL, 7.00, 0.5, 2.0, 10.0);
            Scarf scarf = new Scarf(cf2, "scarf", Content.COTTON, 15.00, 0.3, 8.0, 15.0, 50.0);

            Knitting[] knittings = {hat, scarf};
            Store store = new Store(knittings);


            System.out.println(store.listStoreItems());
            System.out.println(store.calculateAllMaterials());


        } catch (KnittingException e) {
            System.out.println("Error: " + e.getMessage());
        }



    }
}
