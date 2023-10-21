package bg.tu_varna.sit.b3.f22621663.homework3.task3;

public class Application3 {
    public static void main(String[] args) {
        City city = new City("Варна", 4444);
        IdentificationCard idCard = new IdentificationCard("FN22621663", 2020, "FN22621663", city);
        Person person = new Person("Кристиян", "Красимиров", "Писев");
        Adult adult = new Adult("Кристиян", "Красимиров", "Писев", idCard);


        adult.getPersonalInformation();
    }
}
