public class Person {
    //person ima super kum klasa Object
    String firstName;
    String lastName;

    Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //getter, equals, toString
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }


    //наследяването не е множествено и не е в двете посоки i roditelq ne znae za naslednika
    public class Student extends Person{
        String fNumber;
        double avgGrades;
        Student(String firstName, String lastName, String fNumber, double avgGrades) {
            //Super se obrushta kum roditelq. Dava dostup do roditelq (konstruktora). Tochkata e kum promenliva ili metod
            super(firstName, lastName); //Super e FIRST
            this.fNumber = fNumber;
            this.avgGrades = avgGrades;
        }
    }

    public class Teacher extends Person{
        String subject;

        Teacher(String subject, String firstName, String lastName){
            super(firstName, lastName);
            this.subject = subject;
        }
    }
}
