package bg.tu_varna.sit.a2.f22621663.homework9.task1;

import java.util.ArrayList;
import java.util.List;

class Hotel {
    private List<Room> rooms;

    public Hotel() {
        this.rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void createReservation(int days, Exposure exposure, boolean hasChildren) {
        for (Room room : rooms) {

            if (room instanceof SingleRoom && room.isAvailable() && room.getExposure() == exposure) {
                ((SingleRoom) room).setAvailable(false);
                System.out.println("Created: " + room);
                return;
            } else if (room instanceof DoubleRoom && room.isAvailable() && room.getExposure() == exposure && !((DoubleRoom) room).hasChildren()) {
                ((DoubleRoom) room).setAvailable(false);
                System.out.println("Created: " + room);
                return;
            }
        }

        System.out.println("No available rooms");
    }

    public double calculateBookedRoomsDiscount() {
        double totalDiscount = 0;

        for (Room room : rooms) {
            if (!room.isAvailable()) {
                totalDiscount += room.discount();
            }
        }

        return totalDiscount;
    }

    public double calculateAveragePriceOfAvailableRoomsWithSeaView() {
        double totalSeaViewPrice = 0;
        int seaViewCount = 0;

        for (Room room : rooms) {
            if (room.isAvailable() && room.getExposure() == Exposure.SEA_VIEW) {
                totalSeaViewPrice += room.calculateStayPrice();
                seaViewCount++;
            }
        }
        return seaViewCount > 0 ? totalSeaViewPrice / seaViewCount : 0;
    }

    @Override
    public String toString() {

        return "Hotel{" +
                "rooms=" + rooms +
                '}';
    }
}
