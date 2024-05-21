package bg.tu_varna.sit.а2.f22621663;

public class FlightControlSystem {
    public static void main(String[] args) {
        FlightControlMediator mediator = new FlightControlMediatorImpl(2);

        Airplane cargoPlane1 = new CargoPlane("CargoPlane 1", 10000, "Palettes", mediator);
        Airplane passengerPlane1 = new PassengerPlane("PassengerPlane 1", 180, mediator);
        Airplane passengerPlane2 = new PassengerPlane("PassengerPlane 2", 220, mediator);

        System.out.println(cargoPlane1.requestLanding());
        System.out.println(passengerPlane1.requestLanding());
        System.out.println(passengerPlane2.requestLanding());

        System.out.println(cargoPlane1.requestTakeoff());
        System.out.println(passengerPlane2.requestLanding());

        System.out.println("CargoPlane 1 Black Box: " + cargoPlane1.getBlackBox());
        System.out.println("PassengerPlane 1 Black Box: " + passengerPlane1.getBlackBox());
        System.out.println("PassengerPlane 2 Black Box: " + passengerPlane2.getBlackBox());
    }
}
