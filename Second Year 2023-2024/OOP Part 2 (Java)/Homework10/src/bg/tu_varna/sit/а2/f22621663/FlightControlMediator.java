package bg.tu_varna.sit.а2.f22621663;

interface FlightControlMediator {
    boolean requestLanding(Airplane airplane);

    boolean requestTakeoff(Airplane airplane);

    void sendMessage(String message, Airplane airplane);
}
