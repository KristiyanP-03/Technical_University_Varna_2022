package adapter;

// Адаптер, който преобразува USB TypeA към USB TypeC
public class TypeAtoTypeCAdapter implements USBTypeC {
    private USBTypeA deviceWithUSBTypeA;

    public TypeAtoTypeCAdapter(USBTypeA deviceWithUSBTypeA) {
        this.deviceWithUSBTypeA = deviceWithUSBTypeA;
    }

    @Override
    public void connectUsingTypeC() {
        // Преобразуваме използването на USB TypeA към USB TypeC
        deviceWithUSBTypeA.connectUsingTypeA();
        System.out.println("Connected using USB TypeC adapter.");
    }
}
