package bg.tu_varna.sit.b3.f22621663.homework3.testprep;

import java.io.Console;

public class Application {
    public static void main(String[] args) {
        Person me = new Person("Крис", 20);
        me.IntroduceYourselfAsPerson();

        Student againMe = new Student("Крис", 20, "Нз");
        againMe.setName("Кристиян Красимиров Писев");
        againMe.IntroduceYourselfAsStudent();
    }
}

class Person {
    //полетата на класа
    String name;
    int age;
    //
    //Експлицитен конструктор
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    //



    //get-ер ( метод за четене / извличане на информация )
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    //
    //set-ер ( метод за запис / променяне на информация )
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    //

    //custom метод
    void IntroduceYourselfAsPerson(){
        System.out.println("I am " + this.name + ", " + this.age + " y/o.");
    }
}

class Student extends Person {
    String fNumber;

    Student(String name, int age, String fNumber){
        super(name, age);
        this.fNumber = "FN22621663";
    }

    public String getfNumber() {
        return fNumber;
    }
    public void setfNumber(String fNumber) {
        this.fNumber = fNumber;
    }


    void IntroduceYourselfAsStudent(){
        System.out.println("I am " + this.name + ", " + this.age + " y/o and my faculty number is: " + this.fNumber);
    }
}
