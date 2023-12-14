package bg.tu_varna.sit.a2.f22621663.homework9.task3;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Faculty {
    private String facultyName;
    private Set<Student> students;

    public Faculty(String facultyName) {
        this.facultyName = facultyName;
        this.students = new HashSet<>();
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public double calculateAverageGrades() {
        return students.stream().mapToDouble(Student::getGrades).average().orElse(0.0);
    }

    public long getNumberOfStudentsBySpeciality(Speciality speciality) {
        return students.stream().filter(student -> student.getSpeciality() == speciality).count();
    }

    public List<Student> getStudentsWithExcellentGrades() {
        return students.stream().filter(student -> student.getGrades() >= 5.5).toList();
    }

    public long getNumberOfStudentsByCourse(int course) {
        return students.stream().filter(student -> student.getCourse() == course).count();
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "facultyName='" + facultyName + '\'' +
                ", students=" + students +
                '}';
    }
}
