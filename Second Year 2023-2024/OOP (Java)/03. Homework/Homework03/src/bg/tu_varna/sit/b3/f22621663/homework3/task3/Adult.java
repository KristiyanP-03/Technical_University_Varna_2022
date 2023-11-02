package bg.tu_varna.sit.b3.f22621663.homework3.task3;


public class Adult extends Person {
    private IdentificationCard identificationCard;


    public Adult(String firstName, String secondName, String thirdName, IdentificationCard identificationCard) {
        super(firstName, secondName, thirdName);
        this.identificationCard = identificationCard;
    }


    public IdentificationCard getIdentificationCard() {
        return identificationCard;
    }


    public void setIdentificationCard(IdentificationCard identificationCard) {
        this.identificationCard = identificationCard;
    }


    public void getPersonalInformation() {
        System.out.println(iAm());
        System.out.println("\nЛична карта номер: " + identificationCard.getNumber()+ "\t\t\tИздадена от: "
                + identificationCard.publishedBy());
    }
}
