package bg.tu_varna.sit.b3.f22621663.homework3.task3;

public class Person {
    private String firstName;
    private String secondName;
    private String thirdName;


    public Person(String firstName, String secondName, String thirdName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.thirdName = thirdName;
    }


    public String getFirstName() {
        return firstName;
    }
    public String getSecondName() {
        return secondName;
    }
    public String getThirdName() {
        return thirdName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }


    public String iAm() {
        return thirdName + ", " + firstName + " " + secondName;
    }
}
