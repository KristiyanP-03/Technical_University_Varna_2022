package bg.tu_varna.sit.a2.f22621663.homework10.task5;

import java.util.ArrayList;
import java.util.List;

class Discipline {
    private String name;
    private List<Student> students;
    private Teacher lector;

    public Discipline(String name, Teacher lector) {
        this.name = name;
        this.students = new ArrayList<>();
        this.lector = lector;
    }

    public List<Student> getStudents() {
        return students;
    }


    public void addStudent(Student student, int semestrialPoints) {
        if (semestrialPoints < 0 || semestrialPoints > 40) {
            throw new SemestrialControlException();
        }
        studentSemestrialPoints.put(student, semestrialPoints);
    }

}
