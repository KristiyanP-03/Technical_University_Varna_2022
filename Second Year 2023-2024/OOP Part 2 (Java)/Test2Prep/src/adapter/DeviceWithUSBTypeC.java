package adapter;

// Клас, който представя устройството с USB TypeC порт
public class DeviceWithUSBTypeC implements USBTypeC {
    @Override
    public void connectUsingTypeC() {
        System.out.println("Connected using USB TypeC cable.");
    }
}
