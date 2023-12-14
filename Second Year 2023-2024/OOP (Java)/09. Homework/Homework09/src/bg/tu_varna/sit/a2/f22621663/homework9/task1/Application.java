package bg.tu_varna.sit.a2.f22621663.homework9.task1;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();

        SingleRoom singleRoom1 = new SingleRoom(50, Exposure.SEA_VIEW, 4);
        SingleRoom singleRoom2 = new SingleRoom(60, Exposure.PARK_VIEW, 2);
        DoubleRoom doubleRoom1 = new DoubleRoom(70, Exposure.SEA_VIEW, 6, false);
        DoubleRoom doubleRoom2 = new DoubleRoom(80, Exposure.PARK_VIEW, 3, true);

        hotel.addRoom(singleRoom1);
        hotel.addRoom(singleRoom2);
        hotel.addRoom(doubleRoom1);
        hotel.addRoom(doubleRoom2);

        System.out.println("Before:");
        System.out.println(hotel);

        hotel.createReservation(3, Exposure.SEA_VIEW, false);
        hotel.createReservation(5, Exposure.PARK_VIEW, true);

        System.out.println("After:");
        System.out.println(hotel);

        System.out.println("Discount: " + hotel.calculateBookedRoomsDiscount());
        System.out.println("Average price : " + hotel.calculateAveragePriceOfAvailableRoomsWithSeaView());
    }
}
