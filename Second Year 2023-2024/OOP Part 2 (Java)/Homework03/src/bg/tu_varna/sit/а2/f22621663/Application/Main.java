package bg.tu_varna.sit.а2.f22621663.Application;

import bg.tu_varna.sit.а2.f22621663.Functionality.Agent;
import bg.tu_varna.sit.а2.f22621663.Enumeration.Type;
import bg.tu_varna.sit.а2.f22621663.Functionality.RealEstate;

public class Main {
    public static void main(String[] args) {
        RealEstate realEstate1 = new RealEstate.Builder(Type.HOUSE, 100, 100000)
                .numberOfRooms(5)
                .furnished(true)
                .hasGarage(true)
                .hasGarden(true)
                .build();
        RealEstate realEstate2 = new RealEstate.Builder(Type.OFFICE, 20, 20000)
                .numberOfRooms(1)
                .furnished(false)
                .hasGarage(false)
                .hasGarden(false)
                .build();



        Agent agent = new Agent("Kristiyan Pisev", "088 888 8888");
        agent.addRealEstateToAgency(realEstate1);
        agent.addRealEstateToAgency(realEstate2);


    }
}
