package bg.tu_varna.sit.a2.f22621663.homework9.task3;

import java.util.*;

public class Application {
    public static void main(String[] args) throws InvalidDataException {
        Student student1 = new Student("John", "Doe", 20, "F12345", Speciality.SIT, 2, 4.5);
        Student student2 = new Student("Jane", "Smith", 21, "F67890", Speciality.CST, 3, 5.8);
        Student student3 = new Student("Bob", "Johnson", 19, "F54321", Speciality.A, 1, 6.0);

        Faculty faculty = new Faculty("Computer Science");

        faculty.addStudent(student1);
        faculty.addStudent(student2);
        faculty.addStudent(student3);

        System.out.println("Faculty: " + faculty.getFacultyName());
        System.out.println("Average Grades: " + faculty.calculateAverageGrades());
        System.out.println("Number of SIT Students: " + faculty.getNumberOfStudentsBySpeciality(Speciality.SIT));
        System.out.println("Students with Excellent Grades: " + faculty.getStudentsWithExcellentGrades());
        System.out.println("Number of Students in Course 2: " + faculty.getNumberOfStudentsByCourse(2));
    }
}
