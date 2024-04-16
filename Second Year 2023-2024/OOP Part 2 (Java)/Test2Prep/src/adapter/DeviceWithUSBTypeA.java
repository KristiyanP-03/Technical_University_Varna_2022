package adapter;

// Клас, който представя устройството с USB TypeA порт
public class DeviceWithUSBTypeA implements USBTypeA {
    @Override
    public void connectUsingTypeA() {
        System.out.println("Connected using USB TypeA cable.");
    }
}
