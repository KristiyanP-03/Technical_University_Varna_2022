package CreationPattern.Builder;

public class BuilderExample {
    public static void main(String[] args) {
        // Създаваме обект на Computer чрез ComputerBuilder
        Computer gamingPC = new Computer.ComputerBuilder()
                .setCPU(true)
                .setGPU(true)
                .setRAM(true)
                .setSSD(true)
                .setHDD(true)
                .setPowerSupply(true)
                .build();

        Computer basicPC = new Computer.ComputerBuilder()
                .setCPU(true)
                .setRAM(true)
                .setHDD(true)
                .setPowerSupply(true)
                .build();

        System.out.println(gamingPC);
        System.out.println(basicPC);
    }
}
