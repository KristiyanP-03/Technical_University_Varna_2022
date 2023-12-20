package bg.tu_varna.sit.a2.f22621663.homework10.task5;

// Клас за студент
class Student extends Person {
    private Course course;

    public Student(String name, Course course) {
        super(name);
        this.course = course;
    }
}
