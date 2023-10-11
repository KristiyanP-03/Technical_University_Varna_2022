package bg.tu_varna.sit.a1.f1234567.homework1.task1.task2;//======Теория=======================================

import java.util.ArrayList;

public class Student {
    //aтрибути
    String firstName;
    String lastName;
    int fNumber;

    //конструктори
    //1) дефолтен, по подразбиране
    Student(){}
    //2) експлицитен, параметризиран (веднъж се създава)
    Student(String firstName, String lastName, int fNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.fNumber = fNumber;
    }

    //аксетори get/set
    //1) getter - за четене (връщат резултат)
    String getFirstName(){
        return firstName;
    }
    String getLastName(){
        return lastName;
    }
    int getFNumber(){
        return fNumber;
    }
    //2) setters - за запис (не връщат резултат) #трябва ако нямаме експлецитен конструктор
    void setFirstName(String firstName){
        this.firstName = firstName;
    }
    void setLastName(String lastNameName){
        this.lastName = lastName;
    }
    void setFNumber(int fNumber){
        this.fNumber = fNumber;
    }

    //метод за текстово представяне
    public String toString(){ //всеки метод на класа е публик за да го наследи
        return firstName + " " + lastName + " " + fNumber;
    }

    //метод за равенство
    public boolean equals(Object o){
        Student s = (Student) o; //#кастване
        return this.fNumber == s.fNumber;
    }
    /*
     * this.firstName.equals(s.firstName)
     * */

    public static void main(String[] args) { //Главна функция
        Student firstStudent = new Student(); // Създавам обект с дефолтни стойности

        //викаш сетъри
        firstStudent.setFirstName("John");
        firstStudent.setLastName("Doe");
        firstStudent.setFNumber(123456);

        System.out.println("First student is: " + firstStudent.toString());


        //с експлицитният пишеш вътре и не ти трябват сетъри
        Student secondStudent = new Student("John","Doe", 123456); // Създавам обект с дефолтни стойности

        System.out.println("First student is: " + secondStudent.toString());



        if(firstStudent.equals(secondStudent)){
            System.out.println("Same student");
        }
        else{
            System.out.println("Different student");
        }


        Student thirdStudent = new Student("John","Doe", 123456);
        firstStudent.equals(thirdStudent); // True
        //firstStudent == thirdStudent //False (различни адреси)



        //wrapper класове (за колекции)
        // byte -> Byte
        // short -> Short
        // int -> Integer
        // long -> Long
        // float -> Float
        // boolean -> Boolean
        // char -> Character

        //        double a = 3.5;
        //        a = new Double(5.5);
    }
}