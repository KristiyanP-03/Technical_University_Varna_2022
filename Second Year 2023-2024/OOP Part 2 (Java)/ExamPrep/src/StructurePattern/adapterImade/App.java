package StructurePattern.adapterImade;

public class App {
    public static void main(String[] args) {
        UsbA deviceA = new DeviceA();

        UsbC adapter = new AdapterAtoC(deviceA);

        adapter.connectingC();
    }
}
