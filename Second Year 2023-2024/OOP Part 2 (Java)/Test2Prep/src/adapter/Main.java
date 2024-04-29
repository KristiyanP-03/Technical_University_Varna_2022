package adapter;

// Тестване на връзката
public class Main {
    public static void main(String[] args) {
        // Създаване на устройството с USB TypeA порт
        USBTypeA deviceWithUSBTypeA = new DeviceWithUSBTypeA();

        // Използване на адаптера за свързване на устройството с USB TypeA порт към устройството с USB TypeC порт
        USBTypeC adapter = new TypeAtoTypeCAdapter(deviceWithUSBTypeA);

        // Свързване на устройствата с помощта на адаптера
        adapter.connectUsingTypeC();
    }
}
