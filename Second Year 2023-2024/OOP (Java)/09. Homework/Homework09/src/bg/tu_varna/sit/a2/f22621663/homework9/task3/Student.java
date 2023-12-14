package bg.tu_varna.sit.a2.f22621663.homework9.task3;

import java.util.Objects;

class Student extends Person implements Comparable<Student> {
    private String fNumber;
    private Speciality speciality;
    private int course;
    private double grades;

    public Student(String firstName, String lastName, int age, String fNumber, Speciality speciality, int course, double grades) throws InvalidDataException {
        super(firstName, lastName, age);
        if (isValidCourse(course) && isValidGrades(grades)) {
            this.fNumber = fNumber;
            this.speciality = speciality;
            this.course = course;
            this.grades = grades;
        } else {
            throw new InvalidDataException();
        }
    }

    public String getfNumber() {
        return fNumber;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public int getCourse() {
        return course;
    }

    public double getGrades() {
        return grades;
    }

    public void setCourse(int course) throws InvalidDataException {
        if (isValidCourse(course)) {
            this.course = course;
        } else {
            throw new InvalidDataException();
        }
    }

    public void setGrades(double grades) throws InvalidDataException {
        if (isValidGrades(grades)) {
            this.grades = grades;
        } else {
            throw new InvalidDataException();
        }
    }

    @Override
    public int compareTo(Student other) {
        return this.fNumber.compareTo(other.fNumber);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Student student = (Student) obj;
        return Objects.equals(fNumber, student.fNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), fNumber);
    }

    @Override
    public String toString() {
        return "Student{" +
                "fNumber='" + fNumber + '\'' +
                ", speciality=" + speciality +
                ", course=" + course +
                ", grades=" + grades +
                "} " + super.toString();
    }

    private boolean isValidCourse(int course) {
        return course > 0 && course <= 4;
    }

    private boolean isValidGrades(double grades) {
        return grades >= 2.0 && grades <= 6.0;
    }
}
