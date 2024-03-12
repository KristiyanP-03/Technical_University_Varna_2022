package bg.tu_varna.sit.а2.f22621663.Functionality;

public class Agent {
    private String name;
    private String phoneNumber;



    public Agent(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }



    public void addRealEstateToAgency(RealEstate realEstate) {
        Agency.getInstance().addRealEstate(realEstate);
    }

    public void removeRealEstateFromAgency(RealEstate realEstate) {
        Agency.getInstance().removeRealEstate(realEstate);
    }

}
