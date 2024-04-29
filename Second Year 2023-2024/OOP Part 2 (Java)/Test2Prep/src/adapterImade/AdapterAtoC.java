package adapterImade;

public class AdapterAtoC implements UsbC{
    private UsbA microConnectorAtoC;

    public AdapterAtoC(UsbA microConnectorAtoC) {
        this.microConnectorAtoC = microConnectorAtoC;
    }

    @Override
    public void connectingC() {
        microConnectorAtoC.connectingA();
    }
}
