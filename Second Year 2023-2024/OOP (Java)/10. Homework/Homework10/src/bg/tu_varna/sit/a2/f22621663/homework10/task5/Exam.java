package bg.tu_varna.sit.a2.f22621663.homework10.task5;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class Exam {
    Discipline discipline;

    public Exam(Discipline discipline) {
        this.discipline = discipline;
    }

    public Map<Student, Integer> run() {
        Map<Student, Integer> examPoints = new HashMap<>();
        Random random = new Random();

        for (Student student : discipline.getStudents()) {
            int points = random.nextInt(61);
            examPoints.put(student, points);
            discipline.addStudent(student, discipline.getSemestrialPoints(student) + points);
        }

        return examPoints;
    }
}
