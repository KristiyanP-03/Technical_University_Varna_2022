package bg.tu_varna.sit.b3.f22621663.homework2.task4;

public class StudentGroup {
    String specialty;
    int course;
    String group;
    int numberOfStudents;

    StudentGroup(String specialty, int course, String group, int numberOfStudents) {
        this.specialty = specialty;
        this.course = course;
        this.group = group;
        this.numberOfStudents = numberOfStudents;
    }

    String getSpecialty() {
        return specialty;
    }

    int getCourse() {
        return course;
    }

    String getGroup() {
        return group;
    }

    int getNumberOfStudents() {
        return numberOfStudents;
    }

    String getDescription() {
        return "Specialty: " + specialty + ", Course: " + course + ", Group: " + group + ", Number of Students: " + numberOfStudents;
    }
}
