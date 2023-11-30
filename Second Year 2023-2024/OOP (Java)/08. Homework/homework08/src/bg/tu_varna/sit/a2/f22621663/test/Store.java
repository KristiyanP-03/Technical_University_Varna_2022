package bg.tu_varna.sit.a2.f22621663.test;

class Store {
    Knitting[] knittings;

    public Store(Knitting[] knittings) {
        this.knittings = knittings;
    }



    public String listStoreItems() {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < knittings.length; i++) {
            result.append((i + 1) + ". " + knittings[i].toString() + "\n");
        }
        return result.toString();
    }



    public double calculateAllMaterials() {
        double totalMaterial = 0;

        for (Knitting knitting : knittings) {
            totalMaterial += knitting.calculateMaterial();
        }

        return totalMaterial;
    }
}

